package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Border extends JsObject {

    public Border() {

    }

    protected Border(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Border(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public Border setBottom(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setBottom(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setBottom(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color3;
    private ColoredFill color4;
    private String color5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public Border setLeft(Stroke color3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color3 = color3;
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
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setLeft(ColoredFill color4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color4 = color4;
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
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", (color4 != null) ? color4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", (color4 != null) ? color4.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setLeft(String color5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
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
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", color5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", color5, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color6;
    private ColoredFill color7;
    private String color8;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public Border setRight(Stroke color6, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", (color6 != null) ? color6.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", (color6 != null) ? color6.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setRight(ColoredFill color7, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", (color7 != null) ? color7.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", (color7 != null) ? color7.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setRight(String color8, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color8 = color8;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color8 = color8;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", color8, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", color8, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color9;
    private ColoredFill color10;
    private String color11;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public Border setTop(Stroke color9, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color9 = color9;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", (color9 != null) ? color9.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", (color9 != null) ? color9.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setTop(ColoredFill color10, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color10 = color10;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", (color10 != null) ? color10.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", (color10 != null) ? color10.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Border setTop(String color11, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color11 = color11;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color11 = color11;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", color11, thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", color11, thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", (color != null) ? color.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", (color1 != null) ? color1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
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

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", (color3 != null) ? color3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", (color4 != null) ? color4.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", color5);
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

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", (color6 != null) ? color6.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", (color7 != null) ? color7.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", color8);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: %s,", (color9 != null) ? color9.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: %s,", (color10 != null) ? color10.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", color11);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern3);
        }
        return "";
    }

    private String generateJSlineJoin3() {
        if (lineJoin3 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin3 != null) ? lineJoin3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap3() {
        if (lineCap3 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap3 != null) ? lineCap3.generateJs() : "null");
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
            js.append(generateJScolor());
            js.append(generateJScolor1());
            js.append(generateJScolor2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJScolor3());
            js.append(generateJScolor4());
            js.append(generateJScolor5());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJScolor6());
            js.append(generateJScolor7());
            js.append(generateJScolor8());
            js.append(generateJSthickness2());
            js.append(generateJSdashpattern2());
            js.append(generateJSlineJoin2());
            js.append(generateJSlineCap2());
            js.append(generateJScolor9());
            js.append(generateJScolor10());
            js.append(generateJScolor11());
            js.append(generateJSthickness3());
            js.append(generateJSdashpattern3());
            js.append(generateJSlineJoin3());
            js.append(generateJSlineCap3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}