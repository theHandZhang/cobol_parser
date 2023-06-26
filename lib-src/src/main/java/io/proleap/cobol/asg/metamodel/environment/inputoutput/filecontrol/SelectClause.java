/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.environment.inputoutput.filecontrol;

import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.NamedElement;
import io.proleap.cobol.asg.metamodel.call.Call;

public interface SelectClause extends CobolDivisionElement, NamedElement {

	void addFileCall(Call fileCall);

	Call getFileCall();

	boolean isOptional();

	void setOptional(boolean optional);

}
