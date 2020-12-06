import org.python.util.PythonInterpreter;
import org.python.core.*;

import java.util.Properties;

public class HelloJython {
    public static void main(String[] args) {
        // 下面这段不加会报错
        Properties props = new Properties();
        props.put("python.home", "D:/jython2.7.2/Lib");
        props.put("python.console.encoding", "UTF-8");
        props.put("python.security.respectJavaAccessibility", "false");
        props.put("python.import.site", "false");
        Properties preProps = System.getProperties();
        PythonInterpreter.initialize(preProps, props, new String[0]);
        // 创建PythonInterpreter对象
        PythonInterpreter pythonInterpreter = new PythonInterpreter();
        // 运行test.py脚本
        pythonInterpreter.execfile("src/test.py");
        // 运行Python命令
        System.out.println("Hello, Jython!");
        pythonInterpreter.exec("import sys");
        pythonInterpreter.exec("print sys");
        pythonInterpreter.set("a", new PyInteger(42));
        pythonInterpreter.exec("print a");
        pythonInterpreter.exec("x = 2+2");
        PyObject x = pythonInterpreter.get("x");
        System.out.println("x: " + x);
        System.out.println("Goodbye, Jython!");
    }
}
