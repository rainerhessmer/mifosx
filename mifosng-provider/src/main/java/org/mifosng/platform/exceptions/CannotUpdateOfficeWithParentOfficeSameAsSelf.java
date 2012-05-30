package org.mifosng.platform.exceptions;

/**
 * Exception thrown when an attempt is made update the parent of a root office.
 */
public class CannotUpdateOfficeWithParentOfficeSameAsSelf extends
		AbstractPlatformDomainRuleException {

	public CannotUpdateOfficeWithParentOfficeSameAsSelf(final Long officeId, final Long parentId) {
		super("error.msg.office.parentId.same.as.id", "Cannot update office with parent same as self.", officeId, parentId);
	}
}
