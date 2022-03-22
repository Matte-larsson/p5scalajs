import scala.scalajs.js
import js.annotation.JSExportTopLevel
import js.annotation.JSExport
import org.scalajs.dom.raw._

import org.scalajs.dom

import upickle.default._
import shared.Protocol
import P5VectorExt._
import java.util.Random

@JSExportTopLevel("RandomWalker")
class RandomWalker() extends js.Object {
  val sketch: js.Function1[Sketch, Unit] = { s =>
    import s._

    val start = 0
    val end = 4
    val random = new scala.util.Random

    var x = 200
    var y = 200

    setup = { () =>
      createCanvas(400, 400)
      var x = 200
      var y = 200
      background(232)

    }
    draw = { () =>
      point(x, y)

      var r = start + random.nextInt((end - start) + 1)

      if r == 0 then x = x + 1
      else if r == 1 then x = x - 1
      else if r == 2 then y = y + 1
      else if r == 3 then y = y - 1

    }
  }
}
