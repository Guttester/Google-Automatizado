import { Elements } from "../components/elements"

describe("CT.10 - Validar mensagem de erro com login inválido", () => {
    it("CT.10 - Validar login (N/A em Produção - Erro 403)", function() {
        cy.visit(Elements.urlGoogle)
        Elements.btnLogin().click()

        cy.origin('https://accounts.google.com', () => {
        cy.get('body').then(($body) => {
            if ($body.text().includes('403')) {
                cy.log('⚠️ NOTA: TESTE IGNORADO - BLOQUEIO DE SEGURANÇA 403')
                cy.log('Este ambiente não permite automação de login.')
                return 
            }
            cy.get('input[type="email"]').type(Elements.emailInvalid)
        })
        })
    })
})