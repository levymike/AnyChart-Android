package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TextParsingSettings extends JsObject  {

    
    private String columnsSeparator;
    private Double cutLength;
    private Boolean ignoreFirstRow;
    private String[] ignoreItems;
    private Boolean ignoreTrailingSpaces;
    private Double maxItems;
    private Double maxLength;
    private Double minLength;
    private TextParsingMode mode;
    private String mode1;
    private String rowsSeparator;

    
    public TextParsingSettings(TextParsingMode mode, String columnsSeparator, Double cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Double maxItems, Double maxLength, Double minLength, String rowsSeparator) {
        this.mode = mode;
        this.columnsSeparator = columnsSeparator;
        this.cutLength = cutLength;
        this.ignoreFirstRow = ignoreFirstRow;
        this.ignoreItems = ignoreItems;
        this.ignoreTrailingSpaces = ignoreTrailingSpaces;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.rowsSeparator = rowsSeparator;

        js.append(String.format(Locale.US, "{mode: %s,columnsSeparator: %s,cutLength: %f,ignoreFirstRow: %b,ignoreItems: %s,ignoreTrailingSpaces: %b,maxItems: %f,maxLength: %f,minLength: %f,rowsSeparator: %s}",  (mode != null) ? mode.generateJs() : "null", columnsSeparator, cutLength, ignoreFirstRow, Arrays.toString(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, rowsSeparator));
    }
    public TextParsingSettings(String mode1, String columnsSeparator, Double cutLength, Boolean ignoreFirstRow, String[] ignoreItems, Boolean ignoreTrailingSpaces, Double maxItems, Double maxLength, Double minLength, String rowsSeparator) {
        this.mode1 = mode1;
        this.columnsSeparator = columnsSeparator;
        this.cutLength = cutLength;
        this.ignoreFirstRow = ignoreFirstRow;
        this.ignoreItems = ignoreItems;
        this.ignoreTrailingSpaces = ignoreTrailingSpaces;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.rowsSeparator = rowsSeparator;

        js.append(String.format(Locale.US, "{mode: %s,columnsSeparator: %s,cutLength: %f,ignoreFirstRow: %b,ignoreItems: %s,ignoreTrailingSpaces: %b,maxItems: %f,maxLength: %f,minLength: %f,rowsSeparator: %s}",  mode1, columnsSeparator, cutLength, ignoreFirstRow, Arrays.toString(ignoreItems), ignoreTrailingSpaces, maxItems, maxLength, minLength, rowsSeparator));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}