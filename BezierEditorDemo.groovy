import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine
import com.neuronrobotics.bowlerkernel.Bezier3d.*;
import eu.mihosoft.vrl.v3d.*;
def URL="https://gist.github.com/4aeeaa49bd3a807eed8f8ff3dea84c48.git"
def file="bez.json"

//Git stored file loaded but not saved
BezierEditor editor = new BezierEditor(ScriptingEngine.fileFromGit(URL, file),20)
//Git file loaded and saved. THis will do a git call on each event of change
//BezierEditor editor = new BezierEditor(URL, file,10)

ArrayList<Transform>  transforms = editor.transforms()

def modelParts = CSG.unionAll(Extrude.hull(new Cube(20).toCSG(), transforms))

return [editor.get(),modelParts]