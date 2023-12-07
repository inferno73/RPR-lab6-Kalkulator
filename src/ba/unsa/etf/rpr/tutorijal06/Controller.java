package ba.unsa.etf.rpr.tutorijal06;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {

    public Label display;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button plusBtn;
    public Button equalsBtn;
    public Button modBtn;
    public Button divBtn;
    public Button minBtn;
    public Button dotBtn;
    public Button mulBtn;



    public void writeMod(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        display.setText(stariTekst + "%");
    }

    public void writeDiv(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        display.setText(stariTekst + "/");
    }

    public void writeMul(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        display.setText(stariTekst + "*");
    }

    public void writeSub(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        display.setText(stariTekst + "-");
    }

    public void write7(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "7");
    }

    public void write8(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "8");
    }

    public void write9(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "9");
    }

    public void writePlus(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        display.setText(stariTekst + "+");
    }

    public void write6(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "6");
    }

    public void write5(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "5");
    }

    public void write4(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "4");
    }

    public void write1(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "1");
    }
    public void write2(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "2");
    }

    public void write3(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        if(!stariTekst.isEmpty() && stariTekst.charAt(0)=='0') stariTekst = stariTekst.substring(1);
        display.setText(stariTekst + "3");
    }

    public void calculateResult(ActionEvent actionEvent) {
        //equalsBtn
        String stariTekst = display.getText();
        //check
        try {
            double result = evaluateExpression(stariTekst);
            display.setText(String.valueOf(result));
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }

    }
    private static double evaluateExpression(String expression) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        Object result = engine.eval(expression);

        // If the result is a number, return it as a double
        if (result instanceof Number) {
            return ((Number) result).doubleValue();
        } else {
            throw new ScriptException("Invalid expression result");
        }
    }
    public void writeDot(ActionEvent actionEvent) {
        String stariTekst = display.getText();
        display.setText(stariTekst + ".");
    }

    public void write0(ActionEvent actionEvent) {
        String stariTekst = display.getText();

        if(stariTekst.equals("0")) return;
        if(stariTekst.isEmpty() || !(stariTekst.charAt(stariTekst.length()-1)=='%' || stariTekst.charAt(stariTekst.length()-1)=='/' ||
                stariTekst.charAt(stariTekst.length()-1)=='+' || stariTekst.charAt(stariTekst.length()-1)=='-'
        || stariTekst.charAt(stariTekst.length()-1)=='*'))
            display.setText(stariTekst + "0");
    }
}
