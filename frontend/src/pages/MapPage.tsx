import React from "react";
import InteractiveMap from "../components/InteractiveMap";

const MapPage: React.FC = () => {
  return (
    <div className="h-full flex flex-col">
      <h1 className="text-3xl font-bold mb-6">Mapa de Incidencias</h1>
      <div className="flex-grow rounded-lg shadow-lg overflow-hidden">
        <InteractiveMap />
      </div>
    </div>
  );
};

export default MapPage;

