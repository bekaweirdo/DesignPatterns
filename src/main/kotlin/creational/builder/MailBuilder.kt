package creational.builder

class MailBuilder(
    private var to: List<String> = listOf(),
    private var cc: List<String> = listOf(),
    private var title: String = "",
    private var message: String = "",
    private var important: Boolean = false
) {
    class Mail internal constructor(
        val to: List<String>,
        val cc: List<String>?,
        val title: String?,
        val message: String?,
        val important: Boolean
    )

    fun builder(): Mail {
        if (to.isEmpty())
            throw RuntimeException("To property is empty")
        return Mail(to,cc,title,message,important)
    }

}