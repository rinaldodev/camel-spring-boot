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
package org.apache.camel.dataformat.csv.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Handle CSV (Comma Separated Values) payloads.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.csv")
public class CsvDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the csv data format. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The reference format to use, it will be updated with the other format
     * options, the default value is CSVFormat.DEFAULT
     */
    private String formatRef;
    /**
     * The name of the format to use, the default value is CSVFormat.DEFAULT
     */
    private String formatName = "DEFAULT";
    /**
     * Disables the comment marker of the reference format.
     */
    private Boolean commentMarkerDisabled = false;
    /**
     * Sets the comment marker of the reference format.
     */
    private String commentMarker;
    /**
     * Sets the delimiter to use. The default value is , (comma)
     */
    private String delimiter;
    /**
     * Use for disabling using escape character
     */
    private Boolean escapeDisabled = false;
    /**
     * Sets the escape character to use
     */
    private String escape;
    /**
     * Use for disabling headers
     */
    private Boolean headerDisabled = false;
    /**
     * To configure the CSV headers
     */
    private List<String> header;
    /**
     * Whether to allow missing column names.
     */
    private Boolean allowMissingColumnNames = false;
    /**
     * Whether to ignore empty lines.
     */
    private Boolean ignoreEmptyLines = false;
    /**
     * Whether to ignore surrounding spaces
     */
    private Boolean ignoreSurroundingSpaces = false;
    /**
     * Used to disable null strings
     */
    private Boolean nullStringDisabled = false;
    /**
     * Sets the null string
     */
    private String nullString;
    /**
     * Used to disable quotes
     */
    private Boolean quoteDisabled = false;
    /**
     * Sets the quote which by default is
     */
    private String quote;
    /**
     * Used for disabling record separator
     */
    private String recordSeparatorDisabled;
    /**
     * Sets the record separator (aka new line) which by default is new line
     * characters (CRLF)
     */
    private String recordSeparator;
    /**
     * Whether to skip the header record in the output
     */
    private Boolean skipHeaderRecord = false;
    /**
     * Sets the quote mode
     */
    private String quoteMode;
    /**
     * Sets whether or not to ignore case when accessing header names.
     */
    private Boolean ignoreHeaderCase = false;
    /**
     * Sets whether or not to trim leading and trailing blanks.
     */
    private Boolean trim = false;
    /**
     * Sets whether or not to add a trailing delimiter.
     */
    private Boolean trailingDelimiter = false;
    /**
     * Sets the implementation of the CsvMarshallerFactory interface which is
     * able to customize marshalling/unmarshalling behavior by extending
     * CsvMarshaller or creating it from scratch.
     */
    private String marshallerFactoryRef;
    /**
     * Whether the unmarshalling should produce an iterator that reads the lines
     * on the fly or if all the lines must be read at one.
     */
    private Boolean lazyLoad = false;
    /**
     * Whether the unmarshalling should produce maps (HashMap)for the lines
     * values instead of lists. It requires to have header (either defined or
     * collected).
     */
    private Boolean useMaps = false;
    /**
     * Whether the unmarshalling should produce ordered maps (LinkedHashMap) for
     * the lines values instead of lists. It requires to have header (either
     * defined or collected).
     */
    private Boolean useOrderedMaps = false;
    /**
     * Refers to a custom CsvRecordConverter to lookup from the registry to use.
     */
    private String recordConverterRef;
    /**
     * Whether the unmarshalling should capture the header record and store it
     * in the message header
     */
    private Boolean captureHeaderRecord = false;

    public String getFormatRef() {
        return formatRef;
    }

    public void setFormatRef(String formatRef) {
        this.formatRef = formatRef;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public Boolean getCommentMarkerDisabled() {
        return commentMarkerDisabled;
    }

    public void setCommentMarkerDisabled(Boolean commentMarkerDisabled) {
        this.commentMarkerDisabled = commentMarkerDisabled;
    }

    public String getCommentMarker() {
        return commentMarker;
    }

    public void setCommentMarker(String commentMarker) {
        this.commentMarker = commentMarker;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public Boolean getEscapeDisabled() {
        return escapeDisabled;
    }

    public void setEscapeDisabled(Boolean escapeDisabled) {
        this.escapeDisabled = escapeDisabled;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }

    public Boolean getHeaderDisabled() {
        return headerDisabled;
    }

    public void setHeaderDisabled(Boolean headerDisabled) {
        this.headerDisabled = headerDisabled;
    }

    public List<String> getHeader() {
        return header;
    }

    public void setHeader(List<String> header) {
        this.header = header;
    }

    public Boolean getAllowMissingColumnNames() {
        return allowMissingColumnNames;
    }

    public void setAllowMissingColumnNames(Boolean allowMissingColumnNames) {
        this.allowMissingColumnNames = allowMissingColumnNames;
    }

    public Boolean getIgnoreEmptyLines() {
        return ignoreEmptyLines;
    }

    public void setIgnoreEmptyLines(Boolean ignoreEmptyLines) {
        this.ignoreEmptyLines = ignoreEmptyLines;
    }

    public Boolean getIgnoreSurroundingSpaces() {
        return ignoreSurroundingSpaces;
    }

    public void setIgnoreSurroundingSpaces(Boolean ignoreSurroundingSpaces) {
        this.ignoreSurroundingSpaces = ignoreSurroundingSpaces;
    }

    public Boolean getNullStringDisabled() {
        return nullStringDisabled;
    }

    public void setNullStringDisabled(Boolean nullStringDisabled) {
        this.nullStringDisabled = nullStringDisabled;
    }

    public String getNullString() {
        return nullString;
    }

    public void setNullString(String nullString) {
        this.nullString = nullString;
    }

    public Boolean getQuoteDisabled() {
        return quoteDisabled;
    }

    public void setQuoteDisabled(Boolean quoteDisabled) {
        this.quoteDisabled = quoteDisabled;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getRecordSeparatorDisabled() {
        return recordSeparatorDisabled;
    }

    public void setRecordSeparatorDisabled(String recordSeparatorDisabled) {
        this.recordSeparatorDisabled = recordSeparatorDisabled;
    }

    public String getRecordSeparator() {
        return recordSeparator;
    }

    public void setRecordSeparator(String recordSeparator) {
        this.recordSeparator = recordSeparator;
    }

    public Boolean getSkipHeaderRecord() {
        return skipHeaderRecord;
    }

    public void setSkipHeaderRecord(Boolean skipHeaderRecord) {
        this.skipHeaderRecord = skipHeaderRecord;
    }

    public String getQuoteMode() {
        return quoteMode;
    }

    public void setQuoteMode(String quoteMode) {
        this.quoteMode = quoteMode;
    }

    public Boolean getIgnoreHeaderCase() {
        return ignoreHeaderCase;
    }

    public void setIgnoreHeaderCase(Boolean ignoreHeaderCase) {
        this.ignoreHeaderCase = ignoreHeaderCase;
    }

    public Boolean getTrim() {
        return trim;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }

    public Boolean getTrailingDelimiter() {
        return trailingDelimiter;
    }

    public void setTrailingDelimiter(Boolean trailingDelimiter) {
        this.trailingDelimiter = trailingDelimiter;
    }

    public String getMarshallerFactoryRef() {
        return marshallerFactoryRef;
    }

    public void setMarshallerFactoryRef(String marshallerFactoryRef) {
        this.marshallerFactoryRef = marshallerFactoryRef;
    }

    public Boolean getLazyLoad() {
        return lazyLoad;
    }

    public void setLazyLoad(Boolean lazyLoad) {
        this.lazyLoad = lazyLoad;
    }

    public Boolean getUseMaps() {
        return useMaps;
    }

    public void setUseMaps(Boolean useMaps) {
        this.useMaps = useMaps;
    }

    public Boolean getUseOrderedMaps() {
        return useOrderedMaps;
    }

    public void setUseOrderedMaps(Boolean useOrderedMaps) {
        this.useOrderedMaps = useOrderedMaps;
    }

    public String getRecordConverterRef() {
        return recordConverterRef;
    }

    public void setRecordConverterRef(String recordConverterRef) {
        this.recordConverterRef = recordConverterRef;
    }

    public Boolean getCaptureHeaderRecord() {
        return captureHeaderRecord;
    }

    public void setCaptureHeaderRecord(Boolean captureHeaderRecord) {
        this.captureHeaderRecord = captureHeaderRecord;
    }
}