package org.jmailen.ktabfmt

class Table(val rows: MutableList<String> = mutableListOf()) {

    fun addRow(text: String) {
        rows += text
    }

    override fun toString() = rows.joinToString("\n")
}
