/*
 * Copyright (c) 2006-2009 by Dirk Riehle, http://dirkriehle.com
 *
 * This file is part of the Wahlzeit photo rating application.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.wahlzeit.handlers;

import java.util.*;

import org.wahlzeit.model.*;
import org.wahlzeit.utils.*;
import org.wahlzeit.webparts.*;

/**
 * 
 * @author dirkriehle
 *
 */
public class ResetSessionPageHandler extends AbstractWebPageHandler {
	
	/**
	 *
	 */
	public ResetSessionPageHandler() {
		initialize(PartUtil.SHOW_NOTE_PAGE_FILE, AccessRights.GUEST);
	}
	
	/**
	 * 
	 */
	protected String doHandleGet(UserSession ctx, String link, Map args) {
		ctx.clear();
		return link;
	}
	
	/**
	 * 
	 */
	protected void makeWebPageBody(UserSession ctx, WebPart page) {
		page.addString("noteHeading", ctx.cfg().getThankYou());
		String msg1 = ctx.cfg().getResetSession();
		String msg2 = ctx.cfg().getContinueWithShowPhoto();
		page.addString("note", HtmlUtil.asPara(msg1) + HtmlUtil.asPara(msg2));
	}

}
