// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceProviderOperationDisplayProperties model. */
@Fluent
public final class ResourceProviderOperationDisplayProperties {
    /*
     * Operation description.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Operation provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Operation resource.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Resource provider operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the publisher property: Operation description.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: Operation description.
     *
     * @param publisher the publisher value to set.
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the provider property: Operation provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Operation provider.
     *
     * @param provider the provider value to set.
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Operation resource.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Operation resource.
     *
     * @param resource the resource value to set.
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Resource provider operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Resource provider operation.
     *
     * @param operation the operation value to set.
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Operation description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Operation description.
     *
     * @param description the description value to set.
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withDescription(String description) {
        this.description = description;
        return this;
    }
}