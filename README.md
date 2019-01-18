Simple HTML table builder
==============================================================
Version 1.0

Description
-----------------------------
This is a simple immutable thread-safe builder for HTML-tables.
For example:
```
import com.zx80live.examples.rabbits._
import AsciiLib.Animals._
import AsciiLib.Plants._


MyTablePrinter() | Rabbit1 | Rabbit2 | Rabbits ||
TwoLittleRabbits | TwoLittleRabbits | TwoLittleRabbits ||
Clover || "A" | "B" || Rabbit1
```

The above code produces the following HTML:

<table border="0"><tr><td><pre>
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
- sbt: 1.2.8
- JRE:  >= 1.8


API
-----------------------------
`Table` - the class which provides an simple immutable HTML-builder.

`Table() | "something"` - returns new builder with the new cell `something`

`Table() || "something"` - returns new builder with the new row which contains the cell `something`

`Table().columns` - returns a max columns count of the current table

`Table().rows` - returns a normalized rows of the current builder. `normalized` means that cells of the shorter rows
contain `colspan` attributes

`Table().map(...)` - transformer of the normalized rows

`Table().foreach(...)` - provides iteration on normalized rows with the side-effect

`Table().toString` - returns HTML-text

`MyTablePrinter` - just simple factory of the `Table` in the terms of test-task.

Usage
-----------------------------
How to fetch local copy:
```
> git clone https://github.com/zx80live/rabbits_dsl
> cd rabbits_dsl
```

How to run tests:
```
> sbt test
```

How to run example [RabbitsApp](https://github.com/zx80live/rabbits_dsl/blob/master/src/main/scala/com/zx80live/examples/rabbits/RabbitsApp.scala) with creation of `result.html` in the current folder:
```
> sbt run
```