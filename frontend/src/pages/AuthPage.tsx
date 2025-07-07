import React, { useState } from "react";
import { useAuth } from "../context/AuthContext";

const LoginForm: React.FC = () => {
  const { login } = useAuth();
  return (
    <form
      onSubmit={(e) => {
        e.preventDefault();
        login();
      }}
      className="space-y-6"
    >
      <div>
        <label
          htmlFor="email-login"
          className="block text-sm font-medium text-gray-700"
        >
          Correo Electrónico
        </label>
        <input
          type="email"
          id="email-login"
          required
          className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
        />
      </div>
      <div>
        <label
          htmlFor="password-login"
          className="block text-sm font-medium text-gray-700"
        >
          Contraseña
        </label>
        <input
          type="password"
          id="password-login"
          required
          className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
        />
      </div>
      <button
        type="submit"
        className="w-full flex justify-center py-2 px-4 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-blue-600 hover:bg-blue-700"
      >
        Iniciar Sesión
      </button>
    </form>
  );
};

const RegisterForm: React.FC = () => {
  const { login } = useAuth();
  return (
    <form
      onSubmit={(e) => {
        e.preventDefault();
        login();
      }}
      className="space-y-6"
    >
      <div>
        <label
          htmlFor="name-register"
          className="block text-sm font-medium text-gray-700"
        >
          Nombre Completo
        </label>
        <input
          type="text"
          id="name-register"
          required
          className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
        />
      </div>
      <div>
        <label
          htmlFor="email-register"
          className="block text-sm font-medium text-gray-700"
        >
          Correo Electrónico
        </label>
        <input
          type="email"
          id="email-register"
          required
          className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
        />
      </div>
      <div>
        <label
          htmlFor="phone-register"
          className="block text-sm font-medium text-gray-700"
        >
          Teléfono
        </label>
        <input
          type="tel"
          id="phone-register"
          className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
        />
      </div>
      <div>
        <label
          htmlFor="password-register"
          className="block text-sm font-medium text-gray-700"
        >
          Contraseña
        </label>
        <input
          type="password"
          id="password-register"
          required
          className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500"
        />
      </div>
      <button
        type="submit"
        className="w-full flex justify-center py-2 px-4 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-blue-600 hover:bg-blue-700"
      >
        Crear Cuenta
      </button>
    </form>
  );
};

const AuthPage: React.FC = () => {
  const [isLogin, setIsLogin] = useState(true);

  return (
    <div className="max-w-md mx-auto bg-white p-8 rounded-xl shadow-lg">
      <div className="mb-6">
        <div className="flex border-b">
          <button
            onClick={() => setIsLogin(true)}
            className={`flex-1 py-2 font-semibold ${isLogin ? "text-blue-600 border-b-2 border-blue-600" : "text-gray-500"}`}
          >
            Iniciar Sesión
          </button>
          <button
            onClick={() => setIsLogin(false)}
            className={`flex-1 py-2 font-semibold ${isLogin ? "text-gray-500" : "text-blue-600 border-b-2 border-blue-600"}`}
          >
            Registrarse
          </button>
        </div>
      </div>
      {isLogin ? <LoginForm /> : <RegisterForm />}
    </div>
  );
};

export default AuthPage;
