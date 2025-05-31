# Sistema de Gerenciamento de Consultas Médicas

## Descrição
Este projeto é um sistema simples para gerenciamento de consultas em uma clínica médica, desenvolvido em Java. Ele permite ao administrador da clínica:
- Adicionar novas consultas
- Pesquisar consultas existentes pelo nome do paciente ou médico
- Alterar informações de uma consulta (data, horário, especialidade, etc.)
- Remover consultas canceladas ou concluídas

O sistema utiliza arrays para armazenar os dados das consultas e oferece métodos para inclusão, pesquisa, alteração e exclusão dos registros.

## Estrutura do Projeto
- `Main.java`: Classe principal para testar a aplicação e interagir com o usuário, demonstrando as funcionalidades de inclusão, pesquisa, alteração e exclusão de consultas.
- `Vetor.java`: Classe responsável por gerenciar o vetor de consultas, com métodos para manipulação dos dados (adicionar, remover, buscar, alterar, etc.).
- `Consulta.java`: Classe que representa uma consulta médica, contendo atributos como nome do paciente, idade, especialidade, data/hora e unidade.
- `situacao_problema.txt`: Descrição do problema proposto e requisitos do sistema.
- `ado_estrutura_de_dados.pdf`: Documento de apoio (caso aplicável).

## Como Executar
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.
2. Compile os arquivos Java:
   ```bash
   javac Main.java Vetor.java Consulta.java
   ```
3. Execute o programa principal:
   ```bash
   java Main
   ```

O programa irá demonstrar as principais operações do sistema diretamente no console.

## Observações
- O tamanho inicial do vetor de consultas pode ser ajustado no código.
- O sistema é uma simulação para fins didáticos e pode ser expandido conforme a necessidade.

---
Desenvolvido para fins acadêmicos. 