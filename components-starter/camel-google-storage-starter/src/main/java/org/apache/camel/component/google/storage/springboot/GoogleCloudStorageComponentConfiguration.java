/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.google.storage.springboot;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageClass;
import org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration;
import org.apache.camel.component.google.storage.GoogleCloudStorageOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Store and retrieve objects from Google Cloud Storage Service using the
 * google-cloud-storage library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.google-storage")
public class GoogleCloudStorageComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the google-storage component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Setting the autocreation of the bucket bucketName.
     */
    private Boolean autoCreateBucket = true;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration
     * type.
     */
    private GoogleCloudStorageConfiguration configuration;
    /**
     * The Service account key that can be used as credentials for the Storage
     * client. It can be loaded by default from classpath, but you can prefix
     * with classpath:, file:, or http: to load the resource from different
     * systems.
     */
    private String serviceAccountKey;
    /**
     * The Cloud Storage class to use when creating the new buckets. The option
     * is a com.google.cloud.storage.StorageClass type.
     */
    private StorageClass storageClass;
    /**
     * The storage client. The option is a com.google.cloud.storage.Storage
     * type.
     */
    private Storage storageClient;
    /**
     * The Cloud Storage location to use when creating the new buckets
     */
    private String storageLocation = "US-EAST1";
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Delete objects from the bucket after they have been retrieved. The delete
     * is only performed if the Exchange is committed. If a rollback occurs, the
     * object is not deleted. If this option is false, then the same objects
     * will be retrieve over and over again on the polls.
     */
    private Boolean deleteAfterRead = true;
    /**
     * Define the destination bucket where an object must be moved when
     * moveAfterRead is set to true.
     */
    private String destinationBucket;
    /**
     * The folder or filename to use when downloading the blob. By default, this
     * specifies the folder name, and the name of the file is the blob name. For
     * example, setting this to mydownload will be the same as setting
     * mydownload/${file:name}. You can use dynamic expressions for fine-grained
     * control. For example, you can specify ${date:now:yyyyMMdd}/${file:name}
     * to store the blob in sub folders based on today's day. Only ${file:name}
     * and ${file:name.noext} is supported as dynamic tokens for the blob name.
     */
    private String downloadFileName;
    /**
     * A regular expression to include only blobs with name matching it.
     */
    private String filter;
    /**
     * If it is true, the Object exchange will be consumed and put into the
     * body. If false the Object stream will be put raw into the body and the
     * headers will be set with the object metadata.
     */
    private Boolean includeBody = true;
    /**
     * If it is true, the folders/directories will be consumed. If it is false,
     * they will be ignored, and Exchanges will not be created for those
     */
    private Boolean includeFolders = true;
    /**
     * Move objects from the origin bucket to a different bucket after they have
     * been retrieved. To accomplish the operation the destinationBucket option
     * must be set. The copy bucket operation is only performed if the Exchange
     * is committed. If a rollback occurs, the object is not moved.
     */
    private Boolean moveAfterRead = false;
    /**
     * The prefix which is used in the BlobListOptions to only consume objects
     * we are interested in
     */
    private String prefix;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * The Object name inside the bucket
     */
    private String objectName;
    /**
     * Set the operation for the producer
     */
    private GoogleCloudStorageOperations operation;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Used for enabling or disabling all consumer based health checks from this
     * component
     */
    private Boolean healthCheckConsumerEnabled = true;
    /**
     * Used for enabling or disabling all producer based health checks from this
     * component. Notice: Camel has by default disabled all producer based
     * health-checks. You can turn on producer checks globally by setting
     * camel.health.producersEnabled=true.
     */
    private Boolean healthCheckProducerEnabled = true;

    public Boolean getAutoCreateBucket() {
        return autoCreateBucket;
    }

    public void setAutoCreateBucket(Boolean autoCreateBucket) {
        this.autoCreateBucket = autoCreateBucket;
    }

    public GoogleCloudStorageConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(GoogleCloudStorageConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getServiceAccountKey() {
        return serviceAccountKey;
    }

    public void setServiceAccountKey(String serviceAccountKey) {
        this.serviceAccountKey = serviceAccountKey;
    }

    public StorageClass getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass;
    }

    public Storage getStorageClient() {
        return storageClient;
    }

    public void setStorageClient(Storage storageClient) {
        this.storageClient = storageClient;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getDeleteAfterRead() {
        return deleteAfterRead;
    }

    public void setDeleteAfterRead(Boolean deleteAfterRead) {
        this.deleteAfterRead = deleteAfterRead;
    }

    public String getDestinationBucket() {
        return destinationBucket;
    }

    public void setDestinationBucket(String destinationBucket) {
        this.destinationBucket = destinationBucket;
    }

    public String getDownloadFileName() {
        return downloadFileName;
    }

    public void setDownloadFileName(String downloadFileName) {
        this.downloadFileName = downloadFileName;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Boolean getIncludeBody() {
        return includeBody;
    }

    public void setIncludeBody(Boolean includeBody) {
        this.includeBody = includeBody;
    }

    public Boolean getIncludeFolders() {
        return includeFolders;
    }

    public void setIncludeFolders(Boolean includeFolders) {
        this.includeFolders = includeFolders;
    }

    public Boolean getMoveAfterRead() {
        return moveAfterRead;
    }

    public void setMoveAfterRead(Boolean moveAfterRead) {
        this.moveAfterRead = moveAfterRead;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public GoogleCloudStorageOperations getOperation() {
        return operation;
    }

    public void setOperation(GoogleCloudStorageOperations operation) {
        this.operation = operation;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public Boolean getHealthCheckConsumerEnabled() {
        return healthCheckConsumerEnabled;
    }

    public void setHealthCheckConsumerEnabled(Boolean healthCheckConsumerEnabled) {
        this.healthCheckConsumerEnabled = healthCheckConsumerEnabled;
    }

    public Boolean getHealthCheckProducerEnabled() {
        return healthCheckProducerEnabled;
    }

    public void setHealthCheckProducerEnabled(Boolean healthCheckProducerEnabled) {
        this.healthCheckProducerEnabled = healthCheckProducerEnabled;
    }
}