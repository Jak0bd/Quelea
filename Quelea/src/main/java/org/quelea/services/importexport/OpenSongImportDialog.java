/*
 * This file is part of Quelea, free projection software for churches.
 * 
 * Copyright (C) 2012 Michael Berry
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.quelea.services.importexport;

import org.quelea.services.languages.LabelGrabber;
import org.quelea.services.utils.FileFilters;

/**
 * An import dialog for Opensong databases.
 * <p>
 * @author Michael
 */
public class OpenSongImportDialog extends ImportDialog {

    /**
     * Create a new opensong import dialog.
     * <p>
     */
    public OpenSongImportDialog() {
        super(new String[]{LabelGrabber.INSTANCE.getLabel("os.import.line1")
        }, FileFilters.ZIP, new OpensongParser(), ImportDialogOptions.disallow());
    }

}
