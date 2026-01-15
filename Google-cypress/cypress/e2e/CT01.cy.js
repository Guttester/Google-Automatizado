import { Elements } from "../components/elements"

describe('CT.01 - Validar acesso com o link "www.google.com"', () => {
  it('CT.01 - Acessa site: Google.com', () => {
    cy.visit(Elements.urlGoogle)
  });
});