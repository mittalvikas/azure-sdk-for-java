// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataFeedDetailStatus. */
public final class DataFeedDetailStatus extends ExpandableStringEnum<DataFeedDetailStatus> {
    /** Static value Active for DataFeedDetailStatus. */
    public static final DataFeedDetailStatus ACTIVE = fromString("Active");

    /** Static value Paused for DataFeedDetailStatus. */
    public static final DataFeedDetailStatus PAUSED = fromString("Paused");

    /**
     * Creates or finds a DataFeedDetailStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataFeedDetailStatus.
     */
    @JsonCreator
    public static DataFeedDetailStatus fromString(String name) {
        return fromString(name, DataFeedDetailStatus.class);
    }

    /** @return known DataFeedDetailStatus values. */
    public static Collection<DataFeedDetailStatus> values() {
        return values(DataFeedDetailStatus.class);
    }
}
