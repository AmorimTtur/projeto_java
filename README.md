# projeto_java

Este código cria uma interface gráfica em Java Swing para gerenciar usuários (login e senha).
Permite cadastrar, consultar, atualizar e deletar usuários através de botões na tela.
Os dados são exibidos em uma tabela e manipulados usando uma classe de acesso ao banco (banco).
O objetivo é oferecer uma forma simples de controle de usuários em um sistema.

Alterar: Permite modificar os dados de um usuário já cadastrado.
O usuário seleciona uma linha da tabela, edita os campos de "Login" e "Senha" e clica em "Alterar" para salvar as mudanças.

Consulta: Busca usuários cadastrados e exibe os resultados na tabela.
Pode listar todos os usuários ou aplicar filtros (por login, por exemplo), dependendo da implementação.

Cadastrar: Adiciona um novo usuário ao sistema.
Os campos "Login" e "Senha" devem estar preenchidos antes de clicar.

Atualizar: Recarrega os dados da tabela.
Útil após uma alteração, exclusão ou cadastro, para garantir que a tabela exiba as informações atualizadas.

