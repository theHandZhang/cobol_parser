 IDENTIFICATION DIVISION.
 PROGRAM-ID. SCTN.
 PROCEDURE DIVISION.
 SOME-SECTION SECTION.
     INIT.
        STOP RUN.
        PERFORM INIT.
     AFTER-INIT.
        DISPLAY "Hello World".
        STOP RUN.