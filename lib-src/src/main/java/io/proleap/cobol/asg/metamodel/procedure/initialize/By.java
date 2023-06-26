/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.initialize;

import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface By extends CobolDivisionElement {

	enum ByType {
		ALPHABETIC, ALPHANUMERIC, ALPHANUMERIC_EDITED, DBCS, EGCS, NATIONAL, NATIONAL_EDITED, NUMERIC, NUMERIC_EDITED
	}

	ByType getByType();

	ValueStmt getValueStmt();

	void setByType(ByType byType);

	void setValueStmt(ValueStmt valueStmt);
}
