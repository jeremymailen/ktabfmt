package org.jmailen.ktabfmt

import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.FreeSpec

class TableTest : FreeSpec() { init {
    "Table" - {
        val subject = Table()

        "with no rows" {
            subject.toString() shouldEqual ""
        }

        "with one row" {
            subject.addRow("one")
            subject.toString() shouldEqual "one"
        }

        "with multiple rows" {
            subject.addRow("one")
            subject.addRow("two")
            subject.toString() shouldEqual "one\ntwo"
        }
    }
} }
