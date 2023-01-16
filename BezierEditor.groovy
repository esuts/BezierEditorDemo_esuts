def URL="https://gist.github.com/4aeeaa49bd3a807eed8f8ff3dea84c48.git"
def file="bez.json"
//Temp file
//BezierEditor editor = new BezierEditor(
//		new File(ScriptingEngine.getAppData().getAbsolutePath()+"/bez2.json")
//		,20)

//Git stored file loaded but not saved
BezierEditor editor = new BezierEditor(ScriptingEngine.fileFromGit(URL, file),20)
//Git file loaded and saved
//BezierEditor editor = new BezierEditor(URL, file,10)




return editor.get()