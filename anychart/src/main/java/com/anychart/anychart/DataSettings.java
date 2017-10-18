package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DataSettings extends JsObject  {

    
    private String caption;
    private String[] header;
    private String[] rows;
    private String text;
    private TextParsingMode textSettings;
    private String textSettings1;
    private TextParsingSettings textSettings2;

    
    public DataSettings(TextParsingMode textSettings, String caption, String[] header, String[] rows, String text) {
        this.textSettings = textSettings;
        this.caption = caption;
        this.header = header;
        this.rows = rows;
        this.text = text;

        js.append(String.format(Locale.US, "{textSettings: %s,caption: %s,header: %s,rows: %s,text: %s}",  (textSettings != null) ? textSettings.generateJs() : "null", caption, Arrays.toString(header), Arrays.toString(rows), text));
    }
    public DataSettings(String textSettings1, String caption, String[] header, String[] rows, String text) {
        this.textSettings1 = textSettings1;
        this.caption = caption;
        this.header = header;
        this.rows = rows;
        this.text = text;

        js.append(String.format(Locale.US, "{textSettings: %s,caption: %s,header: %s,rows: %s,text: %s}",  textSettings1, caption, Arrays.toString(header), Arrays.toString(rows), text));
    }
    public DataSettings(TextParsingSettings textSettings2, String caption, String[] header, String[] rows, String text) {
        this.textSettings2 = textSettings2;
        this.caption = caption;
        this.header = header;
        this.rows = rows;
        this.text = text;

        js.append(String.format(Locale.US, "{textSettings: %s,caption: %s,header: %s,rows: %s,text: %s}",  (textSettings2 != null) ? textSettings2.generateJs() : "null", caption, Arrays.toString(header), Arrays.toString(rows), text));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}