/**
 * DataCleaner (community edition)
 * Copyright (C) 2014 Neopost - Customer Information Management
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.datacleaner.job;

import org.datacleaner.api.InputColumn;
import org.datacleaner.descriptors.ComponentDescriptor;

/**
 * Represents a subinterface of {@link ComponentJob} for all component types
 * that are "configurable beans", meaning that they can be chained together by
 * using {@link InputColumn}s and {@link Outcome}s as requirements/dependencies
 * for their positioning in the processing flow.
 * 
 * @param <E>
 */
public interface ConfigurableBeanJob<E extends ComponentDescriptor<?>> extends ComponentJob, HasBeanConfiguration,
        InputColumnSinkJob, HasComponentRequirement {

    /**
     * {@inheritDoc}
     */
    @Override
    public E getDescriptor();
}
