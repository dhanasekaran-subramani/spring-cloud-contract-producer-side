package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'PUT'
        url '/fraudcheck'
        body([
                "client.id": $(regex('[0-9]{10}')),
                loanAmount: 1000
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body([
                fraudCheckStatus: "OK",
                "acceptance.reason": "Amount OK"
        ])
        headers {
            contentType('application/json')
        }
    }
}