#language: es
@testfeature
Característica: Validacion
  Yo, como usuario
  Quiero, tener una opción
  Para validar el precio de un producto

  @test
  Escenario: Validacion del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario: "sharonevelynb@gmail.com" y clave: "ShBr$1024"
    Cuando navego a la categoria "Clothes" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado "Producto añadido correctamente a su carrito de compra"
    Y valido en el popup que el monto total sea calculado correctamente
    #Cuando finalizo la compra
    #Entonces valido el titulo de la pagina del carrito
    #Y vuelvo a validar el calculo de precios en el carrito