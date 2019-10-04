package concot

class Categoria {
    String nome
    static hasMany = [itens: Item]

    String toString() {
        this.nome
    }

    static constraints = {
        nome nullable: false, blank: false, maxSize: 128, unique: true
    }
}
