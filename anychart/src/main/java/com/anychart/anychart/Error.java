package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Error extends CoreBase {

    public Error() {

    }

    protected Error(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Error(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private ErrorMode mode;
    private String mode1;

    public Error setMode(ErrorMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".mode(%s)", (mode != null) ? mode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", (mode != null) ? mode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".mode(%s)", mode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", mode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueError;
    private Double valueError1;

    public Error setValueError(String valueError) {
        if (jsBase == null) {
            this.valueError = null;
            this.valueError1 = null;
            
            this.valueError = valueError;
        } else {
            this.valueError = valueError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueError(%s)", valueError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueError(%s)", valueError));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setValueError(Double valueError1) {
        if (jsBase == null) {
            this.valueError = null;
            this.valueError1 = null;
            
            this.valueError1 = valueError1;
        } else {
            this.valueError1 = valueError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueError(%f)", valueError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueError(%f)", valueError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public Error setValueErrorStroke(Stroke strokeOrFill, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill = strokeOrFill;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill = strokeOrFill;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setValueErrorStroke(ColoredFill strokeOrFill1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setValueErrorStroke(String strokeOrFill2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", strokeOrFill2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorStroke(%s, %f, %s, %s, %s)", strokeOrFill2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double valueErrorWidth;

    public Error setValueErrorWidth(Double valueErrorWidth) {
        if (jsBase == null) {
            this.valueErrorWidth = valueErrorWidth;
        } else {
            this.valueErrorWidth = valueErrorWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueErrorWidth(%f)", valueErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueErrorWidth(%f)", valueErrorWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueLowerError;
    private Double valueLowerError1;

    public Error setValueLowerError(String valueLowerError) {
        if (jsBase == null) {
            this.valueLowerError = null;
            this.valueLowerError1 = null;
            
            this.valueLowerError = valueLowerError;
        } else {
            this.valueLowerError = valueLowerError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueLowerError(%s)", valueLowerError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueLowerError(%s)", valueLowerError));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setValueLowerError(Double valueLowerError1) {
        if (jsBase == null) {
            this.valueLowerError = null;
            this.valueLowerError1 = null;
            
            this.valueLowerError1 = valueLowerError1;
        } else {
            this.valueLowerError1 = valueLowerError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueLowerError(%f)", valueLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueLowerError(%f)", valueLowerError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String valueUpperError;
    private Double valueUpperError1;

    public Error setValueUpperError(String valueUpperError) {
        if (jsBase == null) {
            this.valueUpperError = null;
            this.valueUpperError1 = null;
            
            this.valueUpperError = valueUpperError;
        } else {
            this.valueUpperError = valueUpperError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueUpperError(%s)", valueUpperError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueUpperError(%s)", valueUpperError));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setValueUpperError(Double valueUpperError1) {
        if (jsBase == null) {
            this.valueUpperError = null;
            this.valueUpperError1 = null;
            
            this.valueUpperError1 = valueUpperError1;
        } else {
            this.valueUpperError1 = valueUpperError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".valueUpperError(%f)", valueUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valueUpperError(%f)", valueUpperError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String xError;
    private Double xError1;

    public Error setXError(String xError) {
        if (jsBase == null) {
            this.xError = null;
            this.xError1 = null;
            
            this.xError = xError;
        } else {
            this.xError = xError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xError(%s)", xError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xError(%s)", xError));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setXError(Double xError1) {
        if (jsBase == null) {
            this.xError = null;
            this.xError1 = null;
            
            this.xError1 = xError1;
        } else {
            this.xError1 = xError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xError(%f)", xError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xError(%f)", xError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke strokeOrFill3;
    private ColoredFill strokeOrFill4;
    private String strokeOrFill5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public Error setXErrorStroke(Stroke strokeOrFill3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            this.strokeOrFill3 = null;
            this.strokeOrFill4 = null;
            this.strokeOrFill5 = null;
            
            this.strokeOrFill3 = strokeOrFill3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill3 = strokeOrFill3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setXErrorStroke(ColoredFill strokeOrFill4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            this.strokeOrFill3 = null;
            this.strokeOrFill4 = null;
            this.strokeOrFill5 = null;
            
            this.strokeOrFill4 = strokeOrFill4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill4 = strokeOrFill4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", (strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setXErrorStroke(String strokeOrFill5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            this.strokeOrFill3 = null;
            this.strokeOrFill4 = null;
            this.strokeOrFill5 = null;
            
            this.strokeOrFill5 = strokeOrFill5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill5 = strokeOrFill5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", strokeOrFill5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorStroke(%s, %f, %s, %s, %s)", strokeOrFill5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double xErrorWidth;

    public Error setXErrorWidth(Double xErrorWidth) {
        if (jsBase == null) {
            this.xErrorWidth = xErrorWidth;
        } else {
            this.xErrorWidth = xErrorWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xErrorWidth(%f)", xErrorWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xErrorWidth(%f)", xErrorWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private String xLowerError;
    private Double xLowerError1;

    public Error setXLowerError(String xLowerError) {
        if (jsBase == null) {
            this.xLowerError = null;
            this.xLowerError1 = null;
            
            this.xLowerError = xLowerError;
        } else {
            this.xLowerError = xLowerError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xLowerError(%s)", xLowerError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xLowerError(%s)", xLowerError));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setXLowerError(Double xLowerError1) {
        if (jsBase == null) {
            this.xLowerError = null;
            this.xLowerError1 = null;
            
            this.xLowerError1 = xLowerError1;
        } else {
            this.xLowerError1 = xLowerError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xLowerError(%f)", xLowerError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xLowerError(%f)", xLowerError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String xUpperError;
    private Double xUpperError1;

    public Error setXUpperError(String xUpperError) {
        if (jsBase == null) {
            this.xUpperError = null;
            this.xUpperError1 = null;
            
            this.xUpperError = xUpperError;
        } else {
            this.xUpperError = xUpperError;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xUpperError(%s)", xUpperError));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xUpperError(%s)", xUpperError));
                js.setLength(0);
            }
        }
        return this;
    }


    public Error setXUpperError(Double xUpperError1) {
        if (jsBase == null) {
            this.xUpperError = null;
            this.xUpperError1 = null;
            
            this.xUpperError1 = xUpperError1;
        } else {
            this.xUpperError1 = xUpperError1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xUpperError(%f)", xUpperError1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xUpperError(%f)", xUpperError1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %s,", (mode != null) ? mode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", mode1);
        }
        return "";
    }

    private String generateJSvalueError() {
        if (valueError != null) {
            return String.format(Locale.US, "valueError: %s,", valueError);
        }
        return "";
    }

    private String generateJSvalueError1() {
        if (valueError1 != null) {
            return String.format(Locale.US, "valueError: %f,", valueError1);
        }
        return "";
    }

    private String generateJSstrokeOrFill() {
        if (strokeOrFill != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill1() {
        if (strokeOrFill1 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill2() {
        if (strokeOrFill2 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", strokeOrFill2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvalueErrorWidth() {
        if (valueErrorWidth != null) {
            return String.format(Locale.US, "valueErrorWidth: %f,", valueErrorWidth);
        }
        return "";
    }

    private String generateJSvalueLowerError() {
        if (valueLowerError != null) {
            return String.format(Locale.US, "valueLowerError: %s,", valueLowerError);
        }
        return "";
    }

    private String generateJSvalueLowerError1() {
        if (valueLowerError1 != null) {
            return String.format(Locale.US, "valueLowerError: %f,", valueLowerError1);
        }
        return "";
    }

    private String generateJSvalueUpperError() {
        if (valueUpperError != null) {
            return String.format(Locale.US, "valueUpperError: %s,", valueUpperError);
        }
        return "";
    }

    private String generateJSvalueUpperError1() {
        if (valueUpperError1 != null) {
            return String.format(Locale.US, "valueUpperError: %f,", valueUpperError1);
        }
        return "";
    }

    private String generateJSxError() {
        if (xError != null) {
            return String.format(Locale.US, "xError: %s,", xError);
        }
        return "";
    }

    private String generateJSxError1() {
        if (xError1 != null) {
            return String.format(Locale.US, "xError: %f,", xError1);
        }
        return "";
    }

    private String generateJSstrokeOrFill3() {
        if (strokeOrFill3 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill3 != null) ? strokeOrFill3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill4() {
        if (strokeOrFill4 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill4 != null) ? strokeOrFill4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill5() {
        if (strokeOrFill5 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", strokeOrFill5);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxErrorWidth() {
        if (xErrorWidth != null) {
            return String.format(Locale.US, "xErrorWidth: %f,", xErrorWidth);
        }
        return "";
    }

    private String generateJSxLowerError() {
        if (xLowerError != null) {
            return String.format(Locale.US, "xLowerError: %s,", xLowerError);
        }
        return "";
    }

    private String generateJSxLowerError1() {
        if (xLowerError1 != null) {
            return String.format(Locale.US, "xLowerError: %f,", xLowerError1);
        }
        return "";
    }

    private String generateJSxUpperError() {
        if (xUpperError != null) {
            return String.format(Locale.US, "xUpperError: %s,", xUpperError);
        }
        return "";
    }

    private String generateJSxUpperError1() {
        if (xUpperError1 != null) {
            return String.format(Locale.US, "xUpperError: %f,", xUpperError1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

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
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSvalueError());
            js.append(generateJSvalueError1());
            js.append(generateJSstrokeOrFill());
            js.append(generateJSstrokeOrFill1());
            js.append(generateJSstrokeOrFill2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSvalueErrorWidth());
            js.append(generateJSvalueLowerError());
            js.append(generateJSvalueLowerError1());
            js.append(generateJSvalueUpperError());
            js.append(generateJSvalueUpperError1());
            js.append(generateJSxError());
            js.append(generateJSxError1());
            js.append(generateJSstrokeOrFill3());
            js.append(generateJSstrokeOrFill4());
            js.append(generateJSstrokeOrFill5());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSxErrorWidth());
            js.append(generateJSxLowerError());
            js.append(generateJSxLowerError1());
            js.append(generateJSxUpperError());
            js.append(generateJSxUpperError1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}