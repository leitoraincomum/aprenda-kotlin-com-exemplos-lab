// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

    fun printFormacao(){
        println("Nome da Formação: $nome \n")
        println("Conteudo: ")
        for (conteudo in conteudos){
            println("${conteudo.nome}")
        }
        println("***************")
        println("Alunos: ")
        for (aluno in inscritos){
            println("${aluno.nome}")
        }
        println("******** Fim ********")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
        var conteudo : List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Kotlin", 90),
        ConteudoEducacional("Mobile", 50),
        ConteudoEducacional("Testes", 10)
    )

    // Criando curso
    var curso = Formacao("Front-End", conteudo)

    // Criando alguns alunos
    var fernanda = Usuario("Fernanda Souza")
    var arthur = Usuario("Arthur Fernandes")

    //Matricula
    curso.matricular(fernanda)
    curso.matricular(arthur)

  //Impressão
    curso.printFormacao()

}
