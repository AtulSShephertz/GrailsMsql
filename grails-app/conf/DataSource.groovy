dataSource {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = ""
            url = "jdbc:mysql://localhost/db"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            dbCreate = "update" // one of 'create', 'create-drop','update'
            // url = "com.mysql.jdbc.Driver"
        }
    }
    test {
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = ""
            url = "jdbc:mysql://localhost/db"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            dbCreate = "update"
            // url = "com.mysql.jdbc.Driver"
        }
    }
    production {
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "adlplrrpr4u41sm5"
            password = "m58skb632bqk6xzxlf0xaurnrpznt93r"
            url = "jdbc:mysql://54.213.93:9878/t"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            dbCreate = "update"
            // url = "com.mysql.jdbc.Driver;shutdown=true"
        }
    }
}
