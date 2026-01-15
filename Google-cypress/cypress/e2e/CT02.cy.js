
import { Elements } from "../components/elements"
import { GoogleSearch } from "../components/googleSearch.component"

describe("CT.02 - Validar pesquisa no campo de busca do google.", () => {
  it("CT.02 - Pesquisar texto.", () => {
    cy.visit(Elements.urlGoogle)
    GoogleSearch.typeAndSearch()
  })
})