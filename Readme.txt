This file contains all classes explanations,functions,methods in order to be better orientation to the user.




////////////////////////////////////////////////////////////////////////
 	 	  <- class : Decoration ->
///////////////////////////////////////////////////////////////////////

**
Decoration class uses to store the tags enums
**

Function : Decoration: (begin decoration,end decoration) 
Target   : Set enum tags for variant actions such as bold,underline,italic.
	 Sets node decoration value.


////////////////////////////////////////////////////////////////////////
   		 <- class : SpecialChar ->
///////////////////////////////////////////////////////////////////////

** 
SpecialChar class uses as node for char
**

Function : SpecialChar(letter)
Target   : Constructor for setting decorations set,set char content

Function : setSign,setContent
Target   : Setters for sign,content

Function : getContent
Target   : getter for node content

////////////////////////////////////////////////////////////////////////
  		  <- class : Text ->
///////////////////////////////////////////////////////////////////////

**
Text class is the linkedlist main class which stores all the nodes actions to be done
**

Function : Text 
Target   : Counstructor to initialize the linkedlist

Function : addDecoration(fromPos, toPos,  decoration) 
Target   :  Adding spesific decoration from "fromPos" to "toPos" to wanted nodes

Function : removeNode(position) 
Target   : removes spesific node from the linkedlist

Function :addNode(charIn)
Target : Adds content to the end of the content


Function : addNodeByPosition( position,ch)
Target   : Adds char to spesific node by its location

Function : toString()
Target   : Prints all content with the tags connected

Function : getTextAsList
Target   : getter for linkedlist



////////////////////////////////////////////////////////////////////////
  	  <- class : TextEditormanager ->
///////////////////////////////////////////////////////////////////////


**
TextEditorManager is a middleman between main class and the text class
**

Function :  TextEditorManager() 
Target   : Constructor to initialize text content and stacks

Function : add( stringToAdd)
Target   : Adds complete string to the end of existing/nonexisting string by using tochararray method and sends each char to text add class

Function : add(stringToAdd,position)
Target   : Add complete string to spesific position

Function : remove(fromPos, toPos) 
Target   : Removes spesific nodes from "fromPos" to "toPos" from linkedlist

Function :  bold( fromPos,  toPos)
Target   : Bolds spesific nodes from "fromPos" to "toPos" from linkedlist

Function :  bold,italic,underline( fromPos,  toPos)
Target   : Bolds spesific nodes from "fromPos" to "toPos" from linkedlist

Function :  Undo
Target   : Undos actions,pops dostack actions

Function : Redo
Target   :Redos actions,pops undostack actions

Function : Print
Target   : Prints content from stacks

////////////////////////////////////////////////////////////////////////
  	  <- class : TextEditorTest ->
///////////////////////////////////////////////////////////////////////

**
TextEditorTest makes tests to all avaliable actions 
**

Function : TextEditorTest()
Target   : Costructor for class , initializes Random object,creats new TextEditorManger class to make tests

Function : randomTest() 
Target   : Randomized input is created,such as randomized tags,letters and actions to be tested

///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////






	


