import React from "react";
import { useNavigate } from "react-router-dom";
import L from "leaflet";
// 1. CORRECCIÓN: Se separan las importaciones en sus propias líneas.
import InteractiveMap from "../components/InteractiveMap";
import type { Report } from "../components/InteractiveMap";

// Los datos de ejemplo.
const sampleReports: Report[] = [
    { id: 1, position: [-16.419, -71.518], title: "Fuga de agua grande", description: "Fuga en la Av. Principal" },
    { id: 2, position: [-16.422, -71.515], title: "Tubería rota", description: "Tubería rota en el parque" },
    { id: 3, position: [-16.415, -71.52], title: "Desborde de desagüe", description: "Alcantarilla colapsada" },
];

const MapPage: React.FC = () => {
  const navigate = useNavigate();

  const handleMapDoubleClick = (coords: L.LatLng) => {
    console.log("Callback RECIBIDO en MapPage. Navegando...", coords);
const { lat, lng } = coords;
    navigate("/crear-reporte", { state: { lat, lng } });
  };

  return (
    // 2. IMPORTANTE: Asegúrate de que este contenedor ocupe toda la altura.
    // La clase 'h-full' es crucial si el padre es un flex container.
    <div className="h-full flex flex-col">
      <h1 className="text-3xl font-bold mb-6">Mapa de Incidencias</h1>
      <p className="mb-4 text-gray-600">
        Haz doble clic en una ubicación en el mapa para crear un nuevo reporte.
      </p>
      {/* Este div debe poder crecer para llenar el espacio disponible. */}
      <div className="flex-grow rounded-lg shadow-lg overflow-hidden">
        <InteractiveMap
          reports={sampleReports}
          onMapDoubleClick={handleMapDoubleClick}
        />
      </div>
    </div>
  );
};

export default MapPage;