# Version 3 (`MarkdownDoclet-3.0.jar`) #

  * Fixed [issue 5](http://code.google.com/p/markdown-doclet/issues/detail?id=5) - unable to use custom taglets with Markdown Doclet.

# Version 2 (`MarkdownDoclet-v2.jar`) #

  * Made changes such that 

&lt;A&gt;



&lt;/A&gt;

 tags are correctly parsed by Markdown. This fixes the {@link} issues
  * Made changes such that `code` tags are replaced with the markdown "`" character. This fixes some instances of badly nested HTML in legacy Javadocs.