A replacement for the standard Sun Java Doclet which allows developers to use Markdown syntax in their Javadoc comments rather than embedding unreadable HTML.

The advantage of Markdown is that the syntax allows for HTML to be passed through, allowing the Markdown doclet to be applied to any existing codebase which may contain HTML Javadoc comments.

Also includes a patched version of [UMLGraph](http://www.umlgraph.org/) which calls the Markdown Doclet instead of the Sun standard doclet.

The doclet also writes a more modern stylesheet for more attractive Javadocs.

Using the Markdown Doclet in Ant (example):

```
<javadoc>
    <classpath><path path="${javac.classpath}"/></classpath>
    <fileset dir="${src.dir}">
        <filename name="**/*.java"/>
    </fileset>
    <doclet name="com.visural.doclets.markdown.standard.Standard" path="lib/MarkdownDoclet.jar">
    </doclet>
</javadoc>
```

Or with UMLGraph diagrams:

```
<javadoc>
    <classpath><path path="${javac.classpath}"/></classpath>
    <fileset dir="${src.dir}">
        <filename name="**/*.java"/>
    </fileset>
    <doclet name="org.umlgraph.markdown.doclet.UmlGraphDoc" path="lib/MarkdownDoclet.jar">
        <param name="-inferrel"/>
        <param name="-inferdep"/>
        <param name="-operations"/>
        <param name="-hide" value="java.*"/>
        <param name="-collpackages" value="java.util.*"/>
        <param name="-qualify"/>
        <param name="-postfixpackage"/>
        <param name="-nodefontsize" value="9"/>
        <param name="-nodefontpackagesize" value="7"/>
    </doclet>
</javadoc>
```