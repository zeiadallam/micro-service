db = db.getSiblingDB('orderDB')

if (!db.getUser('orderuser')) {
    db.createUser({
        user: 'orderuser',
        pwd: 'orderpassword',
        roles: [{ role: 'readWrite', db: 'orderDB' }]
    })
}
