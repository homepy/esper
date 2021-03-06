/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.epl.core.resultset;

public enum ResultSetProcessorType {
    HANDTHROUGH,
    UNAGGREGATED_UNGROUPED,
    FULLYAGGREGATED_UNGROUPED,
    AGGREGATED_UNGROUPED,
    FULLYAGGREGATED_GROUPED,
    FULLYAGGREGATED_GROUPED_ROLLUP,
    AGGREGATED_GROUPED,
}
