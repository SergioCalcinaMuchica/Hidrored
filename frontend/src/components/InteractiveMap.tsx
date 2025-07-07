import React from "react";
import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";
import "leaflet/dist/leaflet.css";
import L from "leaflet";

import iconUrl from "leaflet/dist/images/marker-icon.png";
import iconRetinaUrl from "leaflet/dist/images/marker-icon-2x.png";
import shadowUrl from "leaflet/dist/images/marker-shadow.png";

const DefaultIcon = L.icon({
  iconUrl,
  iconRetinaUrl,
  shadowUrl,
  iconSize: [25, 41],
  iconAnchor: [12, 41],
  popupAnchor: [1, -34],
  shadowSize: [41, 41],
});

L.Marker.prototype.options.icon = DefaultIcon;

interface Report {
  id: number;
  position: L.LatLngExpression;
  title: string;
  description: string;
}

const sampleReports: Report[] = [
  {
    id: 1,
    position: [-16.419, -71.518],
    title: "Fuga de agua grande",
    description: "Fuga en la Av. Principal",
  },
  {
    id: 2,
    position: [-16.422, -71.515],
    title: "Tubería rota",
    description: "Tubería rota en el parque",
  },
  {
    id: 3,
    position: [-16.415, -71.52],
    title: "Desborde de desagüe",
    description: "Alcantarilla colapsada",
  },
];

const InteractiveMap: React.FC = () => {
  const mapCenter: L.LatLngExpression = [-16.42, -71.517];

  return (
    <MapContainer
      center={mapCenter}
      zoom={15}
      style={{ height: "100%", width: "100%", borderRadius: "8px" }}
    >
      <TileLayer
        attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />

     {sampleReports.map((report) => (
        <Marker key={report.id} position={report.position}>
          <Popup>
            <h3 className="font-bold">{report.title}</h3>
            <p>{report.description}</p>
          </Popup>
        </Marker>
      ))}
    </MapContainer>
  );
};

export default InteractiveMap;
