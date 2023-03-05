# sample-graphql-springboot
https://qiita.com/yuuman/items/b518a197f0d79a8ebf82

## GraphiQL
GraphiQL（グラフィカル）はGraphQLクエリを作成、編集、テストするためのWebベースのインタラクティブな統合開発環境。
http://localhost:8080/graphiqls

```graphql
query {
    accountById(accountId:"dummy") {
        accountId,
        userName,
        age,
        accountType,
        serviceGroup {
            serviceGroupId
            serviceGroupName
        }
        team {
            teamId
            teamName
            teamAuthority
            serviceGroup {
                serviceGroupId
                serviceGroupName
            }
        }
    }
}
```