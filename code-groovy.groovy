// User service - fetch and process user data. This is a very long comment line that has been intentionally written without any line breaks so that you can test the word wrap feature in the Code macro — with word wrap disabled you will need to scroll horizontally to read this entire comment, but with word wrap enabled it will automatically break into multiple lines for better readability.

class User {
    int id
    String name
    String email
    boolean active

    @Override
    String toString() {
        return "[${id}] ${name} — ${email} (active: ${active})"
    }
}

def fetchUsers() {
    def users = [
        new User(id: 1, name: "Jane Doe",    email: "jane.doe@example.com",  active: true),
        new User(id: 2, name: "John Smith",  email: "john.smith@example.com", active: false),
        new User(id: 3, name: "Anna Brown",  email: "anna.brown@example.com", active: true),
        new User(id: 4, name: "Tom White",   email: "tom.white@example.com",  active: true),
    ]
    return users
}

def filterActive(users) {
    return users.findAll { it.active }
}

def formatEmails(users) {
    return users.collect { it.email.toLowerCase() }
}

// Main
def users = fetchUsers()
def activeUsers = filterActive(users)

println "All users (${users.size()}):"
users.each { println "  ${it}" }

println "\nActive users only (${activeUsers.size()}):"
activeUsers.each { println "  ${it}" }

println "\nEmails:"
formatEmails(activeUsers).each { println "  ${it}" }
