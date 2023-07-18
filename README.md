
# Filmes Séries Restfull API (JakarataEE)

Projeto onde cadastra-se filmes e séries. (JAX-RS) é uma especificação
para API Restfull na linguagem Java, utilizando o JakarataEE versão 10.




## Documentação da API

#### WADL da API.

```http
  GET /filmes-series-1.0/resources/application.wadl
```

#### Testando a API

```http
  GET /filmes-series-1.0/resources/api
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**. A chave da sua API |


#### Retorna todos os itens cadastrados

```http
  GET /filmes-series-1.0/resources/api/filmes
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `long` | **Automático**. ID do filme |
| `titulo` | `string` | **Obrigatório**. Título do filme |
| `isAssistido` | `boolean` | **Obrigatório**. Flag indicando se o filme foi assistido (true/false) |
| `sinopse` | `string` | **Obrigatório**. Sinópse do filme |
| `genero` | `Object` | **Obrigatório**. Genero do filme (Ação/Suspense...) |
| `classificacao` | `long` | **Obrigatório**. Classificação etária do filme |
| `pais` | `Object` | **Obrigatório**. Pais do lançmento do filme |
| `ano` | `string` | **Obrigatório**. Ano de lançmento do filme |
| `imagePath` | `string` | **Obrigatório**. Imagem do filme |
| `createdAt` | `LocalDateTime` | **Automático**. Data de cadastro do registro |
| `updatedAt` | `LocalDateTime` | **Automático**. Data de atualização do registro |


#### Retorna um filme selecionado

```http
  GET /filmes-series-1.0/resources/api/filme/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id` | `long` | **Obrigatório**. ID do filme |


#### Adiciona um filme

```http
  POST /filmes-series-1.0/resources/api/filme
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id` | `long` | **Automático**. ID do filme |
| `titulo` | `string` | **Obrigatório**. Título do filme |
| `isAssistido` | `boolean` | **Obrigatório**. Flag indicando se o filme foi assistido (true/false) |
| `sinopse` | `string` | **Obrigatório**. Sinópse do filme |
| `genero` | `Object` | **Obrigatório**. Genero do filme (Ação/Suspense...) |
| `classificacao` | `long` | **Obrigatório**. Classificação etária do filme |
| `pais` | `Object` | **Obrigatório**. Pais do lançmento do filme |
| `ano` | `string` | **Obrigatório**. Ano de lançmento do filme |
| `imagePath` | `string` | **Obrigatório**. Imagem do filme |
| `createdAt` | `LocalDateTime` | **Automático**. Data de cadastro do registro |
| `updatedAt` | `LocalDateTime` | **Automático**. Data de atualização do registro |


#### Atualiza um filme

```http
  PUT /filmes-series-1.0/resources/api/filme/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id` | `long` | **Automático**. ID do filme |


#### Deleta um filme

```http
  DELETE /filmes-series-1.0/resources/api/filme/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id` | `long` | **Obrigatório**. ID do filme |



## Stack utilizada

**Back-end:** JakartaEE 10, JDK 11, Payara ou TomEE container

