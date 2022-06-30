package pt.ipbeja.whattodo

import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import pt.ipbeja.whattodo.model.Todo
import pt.ipbeja.whattodo.model.TodoDatabase

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext

        var db = Room.inMemoryDatabaseBuilder(appContext, TodoDatabase::class.java)
            .allowMainThreadQueries()
            .build()

        val todo = Todo("title", "description")
        var id = db.todoDao().insert(todo)

        val get = db.todoDao().getTodo(id)

        val list = db.todoDao().getAll()


        println()


    }
}