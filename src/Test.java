import java.io.IOException;

public class Test {


    public static void main(String[] args) throws IOException {

        test1();
    }

    public static void test2() throws IOException {

        // generate ASG from plain COBOL code
        java.io.File inputFile = new java.io.File("cobol/HelloWorld.cbl");
        io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum format = io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum.TANDEM;
        io.proleap.cobol.asg.metamodel.Program program = new io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl().analyzeFile(inputFile, format);

        // navigate on ASG
        io.proleap.cobol.asg.metamodel.CompilationUnit compilationUnit = program.getCompilationUnit("HelloWorld");
        io.proleap.cobol.asg.metamodel.ProgramUnit programUnit = compilationUnit.getProgramUnit();
        io.proleap.cobol.asg.metamodel.data.DataDivision dataDivision = programUnit.getDataDivision();
        io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry dataDescriptionEntry = dataDivision.getWorkingStorageSection().getDataDescriptionEntry("ITEMS");
        Integer levelNumber = dataDescriptionEntry.getLevelNumber();
    }

    public static void test1() throws IOException {
        // generate ASG from plain COBOL code
        java.io.File inputFile = new java.io.File("cobol/HelloWorld.cbl");
        io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum format = io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum.TANDEM;
        io.proleap.cobol.asg.metamodel.Program program = new io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl().analyzeFile(inputFile, format);

        // traverse the AST
        io.proleap.cobol.CobolBaseVisitor<Boolean> visitor = new io.proleap.cobol.CobolBaseVisitor<Boolean>() {
            @Override
            public Boolean visitDataDescriptionEntryFormat1(final io.proleap.cobol.CobolParser.DataDescriptionEntryFormat1Context ctx) {
                io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry entry = (io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry) program.getASGElementRegistry().getASGElement(ctx);

                return visitChildren(ctx);
            }
        };

        for (final io.proleap.cobol.asg.metamodel.CompilationUnit compilationUnit : program.getCompilationUnits()) {
            visitor.visit(compilationUnit.getCtx());
        }
    }
}
