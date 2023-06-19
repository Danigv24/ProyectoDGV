package com.example.ProyectoDGV.controladores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ProyectoDGV.form.LoginForm;
import com.example.ProyectoDGV.form.PedidosForm;
import com.example.ProyectoDGV.form.UsuarioForm;
import com.example.ProyectoDGV.model.Escuderias;
import com.example.ProyectoDGV.model.Pedidos;
import com.example.ProyectoDGV.model.Pilotos;
import com.example.ProyectoDGV.model.Productos;
import com.example.ProyectoDGV.model.Usuario;
import com.example.ProyectoDGV.model.cesta;
import com.example.ProyectoDGV.repos.Escuderiasrepositorio;
import com.example.ProyectoDGV.repos.Loginrepositorio;
import com.example.ProyectoDGV.repos.Pedidosrepositorio;
import com.example.ProyectoDGV.repos.Pilotosrepositorio;
import com.example.ProyectoDGV.repos.ProductosRepositorio;
import com.example.ProyectoDGV.repos.Usuariorepositorio;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ProyectoControlador {
	@Autowired
	private cesta Cesta;
	
	public ProyectoControlador(cesta cesta) {
		Cesta = cesta;
	}
	@Autowired
	private ProductosRepositorio productosRepositorio;
	@Autowired
	private Loginrepositorio loginRepositorio;
	@Autowired
	private Pedidosrepositorio pedidoRepositorio;
	@Autowired
	private Usuariorepositorio usuarioRepositorio;
	@Autowired
	private Pilotosrepositorio pilotosRepositorio;
	@Autowired
	private Escuderiasrepositorio escuderiasRepositorio;
	
	@GetMapping("/index")
	public String iniPag() {
		return "index";
	}
	@GetMapping("/error")
	public String handleError() {
		return "error";
	}
	
	@GetMapping("/Circuitos")
	public String getCircuitos() {
		return "Circuitos";
	}
	@GetMapping(path="/Ferrari")
	public String getArticulos(Model modelo,HttpServletRequest request) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("Ferrari");
		String lastPage = request.getRequestURI();
	    modelo.addAttribute("lastPage", lastPage);
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "Ferrari";
	}
	@GetMapping(path="/Mercedes")
	public String getArticulosMercedes(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("Mercedes");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "Mercedes";
	}
	@GetMapping(path="/RedBull")
	public String getArticulosRB(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("RedBull");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "RedBull";
	}
	@GetMapping(path="/AM")
	public String getArticulosAM(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("AM");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "AM";
	}
	@GetMapping(path="/Mclaren")
	public String getArticulosMc(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("Mclaren");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "Mclaren";
	}
	@GetMapping(path="/AlfaRomeo")
	public String getArticulosAlfa(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("AlfaRomeo");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "AlfaRomeo";
	}
	
	@GetMapping(path="/AlphaTauri")
	public String getArticulosTauri(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("AlphaTauri");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "AlphaTauri";
	}
	@GetMapping(path="/Williams")
	public String getArticulosWilliams(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("Williams");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "Williams";
	}
	@GetMapping(path="/Haas")
	public String getArticulosHaas(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("Haas");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "Haas";
	}
	@GetMapping(path="/Alpine")
	public String getArticulosAlpine(Model modelo) {
		Iterable<Productos> itarticulos = productosRepositorio.findByEscuderia("Alpine");
	    List<Productos> articulos = new ArrayList<Productos>();
		itarticulos.forEach(articulos::add);
	    modelo.addAttribute("listaProductos", articulos);
	    return "Alpine";
	}
	
	
	@GetMapping("/cesta")
	public String mostrarCesta(Model model,HttpServletRequest request,UsuarioForm usuarioForm) {
		HttpSession session= request.getSession();
	    List<Productos> cesta = Cesta.getProducts();
	    Integer clienteId = (Integer) session.getAttribute("id");
    	
    	if(clienteId != null) {
    		Usuario usuario = usuarioRepositorio.findById(clienteId).orElse(null);
    		model.addAttribute("usuario",usuario);
    	}
	    model.addAttribute("cesta", cesta);
	    model.addAttribute("precio",Cesta.getTotalPrice());
	    
	    return "Cesta";
	}
	
    @PostMapping("/cesta/add")
    public String addToCart(@RequestParam int productId,HttpServletRequest request) {
    	HttpSession session= request.getSession();
    	Cesta.addProduct(productId);
    	int carrito = Cesta.getProducts().size();
	    session.setAttribute("carrito", carrito);
    	String lastPage = request.getHeader("referer");
		return "redirect:"+ lastPage;
        
    }

    @PostMapping("/cesta/remove")
    public String removeFromCart(@RequestParam int productId,HttpServletRequest request) {
    	Cesta.removeProduct(productId);
    	HttpSession session= request.getSession();
    	int carrito = Cesta.getProducts().size();
	    session.setAttribute("carrito", carrito);
        return "redirect:/Cesta";
    }
    @PostMapping("/cesta/clear")
    public String clearFromCart() {
    	Cesta.clearProducts();
        return "redirect:/Cesta";
    }
   
    @GetMapping(path="/login")
	public String login(LoginForm loginForm) {
		return "Login";
	}
	@PostMapping(path="/login")
	public String checkLoginInfo(@ModelAttribute("loginForm") LoginForm loginForm,BindingResult bindingResult, HttpServletRequest request){
		HttpSession session= request.getSession();
		Usuario login = loginRepositorio.findByUsuario(loginForm.getUserName());
		if (login != null && login.getContrasenia().equals(loginForm.getPassword())) {
            // Almacenar la información del usuario en la sesión
            session.setAttribute("usuario", "Welcome "+loginForm.getUserName());
            session.setAttribute("userName", loginForm.getUserName());
            session.setAttribute("rol", login.getRol().getId());
            session.setAttribute("id", login.getId());
            return "index";
        } else {
        	session.setAttribute("error", "usuario/password incorrectos");
            return "Login";
        }
	
	}
	 @PostMapping("/actualizarPerfil")
		public String actualizarPerfil(@ModelAttribute("usuario") @Valid UsuarioForm signupForm, BindingResult bindingResult, HttpServletRequest request, Model model, RedirectAttributes redirectAttributes) {
			HttpSession session = request.getSession();
			if(bindingResult.hasErrors()) {
				System.out.println("Errores");
				return "cesta";
		    }
			Integer clienteId = (Integer) session.getAttribute("id");
			if(clienteId != null) {
	    		Usuario usuario = usuarioRepositorio.findById(clienteId).orElse(null);
			
			if (signupForm.getUsuario() != null && !signupForm.getUsuario().isEmpty()) {
			    usuario.setUsuario(signupForm.getUsuario());
			}
			if (signupForm.getDireccion() != null && !signupForm.getDireccion().isEmpty()) {
			    usuario.setDireccion(signupForm.getDireccion());
			}
			
			usuarioRepositorio.save(usuario);
	    	}
			redirectAttributes.addFlashAttribute("mensaje", "Los cambios se guardaron correctamente.");
			model.addAttribute("usuarioForm", new UsuarioForm());
		    return "redirect:/Cesta";
		}
	@GetMapping(path="/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
		return "index";
	}
	@PostMapping(path="/altapedido")
	public String checkPedidoInfo(@Valid PedidosForm pedidoForm, BindingResult bindingResult, Model modelo,HttpServletRequest request) {
		HttpSession session= request.getSession();
		Usuario usuario = usuarioRepositorio.findByUsuario((String) session.getAttribute("userName"));
		if (usuario == null) {
			modelo.addAttribute("mensaje", "No se encontró el usuario con id " + pedidoForm.getId_cliente());
			return "index";
		}
		Pedidos pedidoNuevo = new Pedidos(Cesta.getTotalPrice());
		pedidoNuevo.setUsuario(usuario);
		System.out.println(pedidoNuevo);
		pedidoRepositorio.save(pedidoNuevo);
		Cesta.clearProducts();
		
		return "index";
	}
	@GetMapping(path="/listadopedidos")
	public String getListaPedidos(Model modelo,HttpServletRequest request) {
		HttpSession session= request.getSession();
		if(session.getAttribute("userName")!=null) {
			Usuario usuario = usuarioRepositorio.findByUsuario((String) session.getAttribute("userName"));
			if(usuario.getRol().getId()==1) {
				Iterable<Pedidos> itPedidos = pedidoRepositorio.findAll();
				
				List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
				itPedidos.forEach(listaPedidos::add);
				modelo.addAttribute("listaPedidos", listaPedidos);
				return "listadopedidos";
				}else {
					List<Pedidos> listaPedidos =pedidoRepositorio.findByUsuario(usuario);
					modelo.addAttribute("listaPedidos", listaPedidos);
					return "listadopedidos";
				}
			
		}	
		modelo.addAttribute("loginForm",new LoginForm());
		return "index";
	}
	@GetMapping(path="/listadoUsuarios")
	public String getListUsuario(Model modelo,HttpServletRequest request) {
		HttpSession session= request.getSession();
		
		Iterable<Usuario> itUsuario = usuarioRepositorio.findAll();
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		itUsuario.forEach(listaUsuario::add);
		modelo.addAttribute("listaUsuario", listaUsuario);
		return "listadoUsuarios";
				
	}
	@GetMapping(path="/listadoPilotos")
	public String getListPilotos(Model modelo,HttpServletRequest request) {
		HttpSession session= request.getSession();
		
		Iterable<Pilotos> itPilotos = pilotosRepositorio.findAll();
		List<Pilotos> listaPilotos = new ArrayList<Pilotos>();
		itPilotos.forEach(listaPilotos::add);
		// Ordenar la lista de pilotos de mayor a menor según los puntos
		Collections.sort(listaPilotos, Comparator.comparingInt(Pilotos::getPuntos).reversed());
		modelo.addAttribute("listaPilotos", listaPilotos);
		
		return "listadoPilotos";
				
	}
	@GetMapping(path="/listadoEscuderias")
	public String getListEscuderias(Model modelo,HttpServletRequest request) {
		HttpSession session= request.getSession();
		
		Iterable<Escuderias> itEscuderia = escuderiasRepositorio.findAll();
		List<Escuderias> listaEscuderia = new ArrayList<Escuderias>();
		itEscuderia.forEach(listaEscuderia::add);
		// Ordenar la lista de pilotos de mayor a menor según los puntos
		Collections.sort(listaEscuderia, Comparator.comparingInt(Escuderias::getPuntos).reversed());
		modelo.addAttribute("listaEscuderias", listaEscuderia);
		return "listadoEscuderias";
				
	}
	 @GetMapping(path="/altastock")
		public String altastock() {
			return "altastock";
		}
	@PostMapping("/altastock")
    public String guardarProducto(@RequestParam("nombreArticulo") String nombreArticulo,
                                   @RequestParam("escuderia") String escuderia,
                                   @RequestParam("precio") int precio,
                                   @RequestParam("imagen") String imagen) throws IOException {
        Productos producto = new Productos(nombreArticulo, escuderia, precio, imagen);
        productosRepositorio.save(producto);
        
        return "altastock";
    }
	@GetMapping(path="/alta")
	public String showForm(UsuarioForm personForm) {
		return "/alta";
	}
	
	@PostMapping(path="/alta")
	public String checkPersonInfo(@Valid UsuarioForm usuForm, BindingResult bindingResult, Model modelo,HttpServletRequest request) {
		HttpSession session= request.getSession();
		if(bindingResult.hasErrors()) {
			return "alta";
		}
		 // Verificar si el usuario ya existe en la base de datos
	    Usuario usuarioExistente = usuarioRepositorio.findByUsuario(usuForm.getUsuario());
	    if (usuarioExistente != null) {
	        // El usuario ya existe, manejar el caso correspondiente
	        session.setAttribute("usuarioRepetido", "El usuario ya existe");
	        return "alta";
	    }
		Usuario usuNuevo= new Usuario(usuForm.getUsuario(),usuForm.getPassword(),usuForm.getDireccion(),usuForm.getCodigopostal());
		usuarioRepositorio.save(usuNuevo);
		modelo.addAttribute("loginForm",new LoginForm());
		return "Login";
	}
	
	@GetMapping ("/carga")
	public String iniPg() {
		return "carga";
	}
	
	@PostMapping("/carga")
	@ResponseBody
	public ResponseEntity<String> FileUpload(@RequestParam("myfile") MultipartFile file,
			HttpServletRequest request , HttpServletResponse response) throws IOException{

		System.out.print("INICIO FILEUPLOAD");
		List<String> numbers = new ArrayList<String>();
		InputStream inputStream = file.getInputStream();
		BufferedReader bufferReader = new BufferedReader (new InputStreamReader(inputStream));
		String numberLine;
		while((numberLine = bufferReader.readLine())!= null) {
			numbers.add(numberLine);
			
		}
		bufferReader.close();
		/* Print all numbers*/
		numbers.forEach(System.out::println);
		String result = String.join(",",numbers);
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}
	@GetMapping(value="/data",produces="application/xml")
	public ResponseEntity<List<Pedidos>> getDataAsXml() {
		Iterable<Pedidos> itPedidos = pedidoRepositorio.findAll();
		List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
		itPedidos.forEach(listaPedidos::add);
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_XML);
	    return new ResponseEntity<>(listaPedidos, headers, HttpStatus.OK);
	}
	@PostMapping("/modificar")
	public String modificarPedido(@RequestParam int id, @RequestParam int importe,Model modelo) {
	    Pedidos pedido = pedidoRepositorio.findById(id);
	    if (pedido != null) {
	        pedido.setImporte(importe);
	        pedidoRepositorio.save(pedido);
	    }
	    Iterable<Pedidos> itPedidos = pedidoRepositorio.findAll();
		
		List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
		itPedidos.forEach(listaPedidos::add);
		modelo.addAttribute("listaPedidos", listaPedidos);
		return "listadopedidos";
	}
	@PostMapping("/eliminar")
	public String eliminarPedido(@RequestParam int id,Model modelo) {
	    // Aquí llamarías al método de tu servicio que elimina el pedido con el id proporcionado
	    pedidoRepositorio.deleteById(id);
	    Iterable<Pedidos> itPedidos = pedidoRepositorio.findAll();
		
		List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
		itPedidos.forEach(listaPedidos::add);
		modelo.addAttribute("listaPedidos", listaPedidos);
		return "listadopedidos";
	}
	@PostMapping("/modificarPR")
	public String modificarProducto(@RequestParam int id, @RequestParam int importe,Model modelo,HttpServletRequest request) {
	    Productos producto = productosRepositorio.findById(id);
	    if (producto != null) {
	    	producto.setPrecio(importe);
	    	productosRepositorio.save(producto);
	    }
	    String lastPage = request.getHeader("referer");
		return "redirect:"+ lastPage;
	}
	@PostMapping("/modificarPilotos")
	public String modificarPilots(@RequestParam int id, @RequestParam int puntos,Model modelo,HttpServletRequest request) {
	    Pilotos piloto = pilotosRepositorio.findById(id);
	    if (piloto != null) {
	    	piloto.setPuntos(puntos);
	    	pilotosRepositorio.save(piloto);
	    }
	    String lastPage = request.getHeader("referer");
		return "redirect:"+ lastPage;
	}
	@PostMapping("/modificarEscuderias")
	public String modificarEscuderias(@RequestParam int id, @RequestParam int puntos,Model modelo,HttpServletRequest request) {
	    Escuderias escuderia = escuderiasRepositorio.findById(id);
	    if (escuderia != null) {
	    	escuderia.setPuntos(puntos);
	    	escuderiasRepositorio.save(escuderia);
	    }
	    String lastPage = request.getHeader("referer");
		return "redirect:"+ lastPage;
	}
	@PostMapping("/eliminarPR")
	public String eliminarProducto(@RequestParam int id,Model modelo,HttpServletRequest request) {
	    
		productosRepositorio.deleteById(id);
		String lastPage = request.getHeader("referer");
		return "redirect:"+ lastPage;
	}
	@PostMapping("/eliminarUsuario")
	public String eliminarUsuario(@RequestParam int id,HttpServletRequest request) {
	    Usuario usuario = usuarioRepositorio.findById(id);
	    if (usuario != null) {
	        List<Pedidos> pedidos = usuario.getListaPedidos();
	        if (!pedidos.isEmpty()) {
	            // Elimina los pedidos asociados al usuario
	            pedidoRepositorio.deleteAll(pedidos);
	        }
	        // Elimina al usuario
	        usuarioRepositorio.delete(usuario);
	    }
	    String lastPage = request.getHeader("referer");
		return "redirect:"+ lastPage;
	     
	}

}

	 

