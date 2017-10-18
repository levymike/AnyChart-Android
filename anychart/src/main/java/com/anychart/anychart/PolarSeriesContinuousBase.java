package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class PolarSeriesContinuousBase extends PolarSeriesBase {

    public PolarSeriesContinuousBase() {

    }

    protected PolarSeriesContinuousBase(String jsBase) {
        this.jsBase = jsBase;
    }

    protected PolarSeriesContinuousBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean closed;

    public PolarSeriesContinuousBase setClosed(Boolean closed) {
        if (jsBase == null) {
            this.closed = closed;
        } else {
            this.closed = closed;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".closed(%b)", closed));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".closed(%b)", closed));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean connectMissingPoints;

    public PolarSeriesContinuousBase setConnectMissingPoints(Boolean connectMissingPoints) {
        if (jsBase == null) {
            this.connectMissingPoints = connectMissingPoints;
        } else {
            this.connectMissingPoints = connectMissingPoints;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".connectMissingPoints(%b)", connectMissingPoints));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectMissingPoints(%b)", connectMissingPoints));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersFactory getMarkers;

    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;

    public PolarSeriesContinuousBase setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".markers(%s)", markers));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", markers));
                js.setLength(0);
            }
        }
        return this;
    }


    public PolarSeriesContinuousBase setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".markers(%b)", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSclosed() {
        if (closed != null) {
            return String.format(Locale.US, "closed: %b,", closed);
        }
        return "";
    }

    private String generateJSconnectMissingPoints() {
        if (connectMissingPoints != null) {
            return String.format(Locale.US, "connectMissingPoints: %b,", connectMissingPoints);
        }
        return "";
    }

    private String generateJSmarkers() {
        if (markers != null) {
            return String.format(Locale.US, "markers: %s,", markers);
        }
        return "";
    }

    private String generateJSmarkers1() {
        if (markers1 != null) {
            return String.format(Locale.US, "markers: %b,", markers1);
        }
        return "";
    }

    private String generateJSmarkers2() {
        if (markers2 != null) {
            return String.format(Locale.US, "markers: %s,", markers2);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMarkers());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSclosed());
            js.append(generateJSconnectMissingPoints());
            js.append(generateJSmarkers());
            js.append(generateJSmarkers1());
            js.append(generateJSmarkers2());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}