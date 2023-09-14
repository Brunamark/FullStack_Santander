class TituloDinamico extends HTMLElement{
    constructor(){
        super();
        const shadow = this.attachShadow({mode: "open"});

        // base do component
        const componentRoot = document.createElement("h1");
        componentRoot.textContent = 'Bruna';
        //estilizar o component
        const style = document.createElement("style");
        style.textContent = `
        h1{
            color:red;
        }
        `
        //enviar para a shadow
    }
}

customElements.define('titulo-dinamico', TituloDinamico); //sempre precisam de um hifen no nome