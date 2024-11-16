document.addEventListener('DOMContentLoaded', () => {
    const formOpenBtn = document.querySelector("#form-open");
    const home = document.querySelector(".home");
    const formContainer = document.querySelector(".form_container");
    const formCloseBtn = document.querySelector(".form_close");
    const signupBtn = document.querySelector("#signup");
    const loginBtn = document.querySelector("#login");
    const pwShowHide = document.querySelectorAll(".pw_hide");
    const telefonoInput = document.querySelector("#telefono");

    // Verificar si hay error al cargar la página
    if (document.body.classList.contains('show-error')) {
        home.classList.add("show");
    }

    // Eventos de UI existentes
    formOpenBtn.addEventListener("click", () => home.classList.add("show"));
    formCloseBtn.addEventListener("click", () => {
        home.classList.remove("show");
        // Limpiar mensaje de error si existe
        const errorMessage = document.querySelector(".error-message");
        if (errorMessage) {
            errorMessage.style.display = 'none';
        }
    });

    // Mostrar/ocultar contraseña
    pwShowHide.forEach((icon) => {
        icon.addEventListener("click", () => {
            const getPwInput = icon.parentElement.querySelector("input");
            if (getPwInput.type === "password") {
                getPwInput.type = "text";
                icon.classList.replace("uil-eye-slash", "uil-eye");
            } else {
                getPwInput.type = "password";
                icon.classList.replace("uil-eye", "uil-eye-slash");
            }
        });
    });

    // Cambiar entre formularios de login y registro
    signupBtn.addEventListener("click", (e) => {
        e.preventDefault();
        formContainer.classList.add("active");
    });
    loginBtn.addEventListener("click", (e) => {
        e.preventDefault();
        formContainer.classList.remove("active");
    });

    // Validación del teléfono
    telefonoInput.addEventListener("input", () => {
        const valor = telefonoInput.value;
        if (valor.length > 10) {
            telefonoInput.value = valor.slice(0, 10);
        }
        telefonoInput.value = telefonoInput.value.replace(/[^0-9]/g, '');
    });

    telefonoInput.addEventListener("keydown", (e) => {
        if (telefonoInput.value.length >= 10 && e.key !== "Backspace" && e.key !== "Delete") {
            e.preventDefault();
        }
    });

    // Nuevo código para login con AJAX
    const loginForm = document.querySelector("#login-form");
    loginForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const formData = new FormData(loginForm);
    const datos = {
        nombre: formData.get('nombre'),
        contraseña: formData.get('contraseña')
    };

    try {
        const response = await fetch('/autenticar_sesion', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(datos)
        });

        console.log('Respuesta del servidor:', response);

        const data = await response.json();

        console.log('Datos:', data);

        if (data.success) {
            window.location.href = '/home';
        } else {
            const errorDiv = document.querySelector(".error-message");
            errorDiv.style.display = 'block';
            errorDiv.querySelector('span').textContent = data.error || 'Error de autenticación';
        }
    } catch (error) {
        console.error('Error:', error);
        const errorDiv = document.querySelector(".error-message");
        errorDiv.style.display = 'block';
        errorDiv.querySelector('span').textContent = 'Error de conexión';
    }
});

    // Si quieres, podemos agregar aquí también el código para manejar el registro
    // Por ejemplo:
    /*
     const signupForm = document.querySelector(".signup_form form");
     signupForm.addEventListener("submit", async (e) => {
     e.preventDefault();
     // Aquí iría el código para manejar el registro
     // Similar al login pero con más campos
     });
     */
});