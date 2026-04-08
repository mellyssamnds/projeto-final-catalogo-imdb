POO-Flix

Sistema de catálogo de filmes desenvolvido com foco em **Programação Orientada a Objetos (POO)**.  
A aplicação permite o gerenciamento de filmes, atores e diretores, além da associação entre essas entidades.

---

## 📌 Objetivo

Simular um catálogo de filmes (semelhante ao IMDB), aplicando conceitos fundamentais de POO:

- Encapsulamento
- Herança
- Polimorfismo
- Classes Abstratas

---

## 🚀 Funcionalidades

- ✅ Cadastrar filmes
- ✅ Cadastrar atores
- ✅ Cadastrar diretores
- ✅ Associar filmes a atores e diretores
- ✅ Buscar filmes por nome (ignorando maiúsculas/minúsculas)

---

## 🧱 Estrutura do Sistema

### 🎥 Filme
Cada filme possui:
- Nome
- Data de lançamento
- Orçamento
- Descrição
- Diretor
- Lista de atores

### 👤 Pessoas

A aplicação utiliza herança para representar pessoas envolvidas:

#### Atributos comuns:
- Nome
- Nacionalidade

#### Especializações:
- 🎭 Ator
- 🎬 Diretor

---

## 🧠 Conceitos de POO Aplicados

| Conceito            | Aplicação no Projeto |
|---------------------|--------------------|
| **Encapsulamento**  | Atributos privados com getters/setters |
| **Herança**         | `Pessoa` → `Ator` e `Diretor` |
| **Polimorfismo**    | Comportamentos distintos entre classes |
| **Classe Abstrata** | `Pessoa` como base abstrata |

---

## 🔍 Busca de Filmes

A busca é realizada pelo nome, ignorando letras maiúsculas e minúsculas.

**Exemplo:**
- Entrada: `vingadores`
- Saída: `Vingadores: Ultimato`


---

## 🛠️ Ferramentas Utilizadas

- Java
- Git e GitHub
- IntelliJ

---

## 📂 Como Executar

```bash
# Clone o repositório
git clone https://github.com/mellyssamnds/projeto-final-catalogo-imdb.git

# Entre na pasta do projeto
cd projeto-final-catalogo-imdb

# Compile o projeto
javac Main.java

# Execute
java Main
```

---


## 👥 Colaboradores

<!--suppress ALL -->
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Eduardo-Unicamp">
        <img src="https://github.com/Eduardo-Unicamp.png" width="100px;" alt="Foto de Eduardo"/><br>
        <sub>
          <b>Eduardo</b>
        </sub>
      </a>
    </td>

 <td align="center">
  <a href="https://github.com/Yta-ux">
    <img src="https://github.com/Yta-ux.png" width="100px;" alt="Foto de Ítalo Gustavo"/><br>
    <sub>
      <b>Ítalo Gustavo</b>
    </sub>
  </a>
</td>

<td align="center">
  <a href="https://github.com/mellyssamnds">
    <img src="https://github.com/mellyssamnds.png" width="100px;" alt="Foto de Mellyssa Mendes"/><br>
    <sub>
      <b>Mellyssa Mendes</b>
    </sub>
  </a>
</td>

<td align="center">
  <a href="https://github.com/thiagoDOTjpeg">
    <img src="https://github.com/thiagoDOTjpeg.png" width="100px;" alt="Foto de Thiago"/><br>
    <sub>
      <b>Thiago</b>
    </sub>
  </a>
</td>
