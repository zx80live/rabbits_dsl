Simple HTML table builder
==============================================================
Version 1.0

Description
-----------------------------
This is a simple immutable thread-safe builder for HTML-files.
For example:
```
import com.zx80live.examples.rabbits.AsciiLib.Animals._
import com.zx80live.examples.rabbits.AsciiLib.Plants._


MyTablePrinter() | Rabbit1 | Rabbit2 | Rabbits ||
TwoLittleRabbits | TwoLittleRabbits | TwoLittleRabbits ||
Clover || "A" | "B" || Rabbit1
```

The above code produces the following HTML:

<table border="1"><tr><td><pre>
&nbsp;\\
&nbsp;&nbsp;\\_
&nbsp;&nbsp;&nbsp;(_)
&nbsp;&nbsp;/&nbsp;)
o(&nbsp;)_\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td><td><pre>
&nbsp;&nbsp;&nbsp;&nbsp;\\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\\_
&nbsp;&nbsp;.---(')
o(&nbsp;)_-\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td><td><pre>
\\
&nbsp;\\_&nbsp;&nbsp;&nbsp;&nbsp;\\
&nbsp;&nbsp;(')&nbsp;&nbsp;&nbsp;&nbsp;\\_
&nbsp;&nbsp;/&nbsp;)=.---(')
o(&nbsp;)o(&nbsp;)_-\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td></tr><tr><td><pre>
&nbsp;&nbsp;&nbsp;\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\\
&nbsp;&nbsp;__()&nbsp;&nbsp;&nbsp;&nbsp;__()
o(_-\_&nbsp;&nbsp;o(_-\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td><td><pre>
&nbsp;&nbsp;&nbsp;\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\\
&nbsp;&nbsp;__()&nbsp;&nbsp;&nbsp;&nbsp;__()
o(_-\_&nbsp;&nbsp;o(_-\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td><td><pre>
&nbsp;&nbsp;&nbsp;\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\\
&nbsp;&nbsp;__()&nbsp;&nbsp;&nbsp;&nbsp;__()
o(_-\_&nbsp;&nbsp;o(_-\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td></tr><tr><td colspan="3"><pre>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.-.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(&nbsp;.&nbsp;)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.-.':'.-.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(&nbsp;&nbsp;=,!,=&nbsp;&nbsp;)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'-'&nbsp;|&nbsp;'-'
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td></tr><tr><td><pre>A</pre></td><td colspan="2"><pre>B</pre></td></tr><tr><td colspan="3"><pre>
&nbsp;\\
&nbsp;&nbsp;\\_
&nbsp;&nbsp;&nbsp;(_)
&nbsp;&nbsp;/&nbsp;)
o(&nbsp;)_\_
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td></tr></table>




Requirements
-----------------------------
- Scala: 2.12.8
- JRE:  >= 8.x



Usage
-----------------------------
How to run tests:
```
> sbt test
```

How to run example with creation of `result.html` in the current folder:
```
> sbt run
```