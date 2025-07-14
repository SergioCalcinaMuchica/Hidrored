import React, { useEffect } from "react";
import {
  MapContainer,
  TileLayer,
  Marker,
  Popup,
  useMapEvents,
} from "react-leaflet";
import "leaflet/dist/leaflet.css";
import L from "leaflet";

const MapConfig = {
  defaultIcon: L.icon({
    iconUrl: "/leaflet/marker-icon.png",
    iconRetinaUrl: "/leaflet/marker-icon-2x.png",
    shadowUrl: "/leaflet/marker-shadow.png",
    iconSize: [25, 41],
    iconAnchor: [12, 41],
    popupAnchor: [1, -34],
    shadowSize: [41, 41],
  }),
  initialize: function() {
    L.Marker.prototype.options.icon = this.defaultIcon;
  }
};

export interface Report {
  id: number;
  position: L.LatLngTuple;
  title: string;
  description: string;
}

interface InteractiveMapProps {
  reports: Report[];
  onMapDoubleClick: (coords: L.LatLng) => void;
}

const MapEvents: React.FC<{ onDoubleClick: (coords: L.LatLng) => void }> = ({ onDoubleClick }) => {
  useMapEvents({
    dblclick(e) {
            console.log("Evento dblclick CAPTURADO en InteractiveMap:", e.latlng);
      onDoubleClick(e.latlng);
    },
  });
  return null;
};

const InteractiveMap: React.FC<InteractiveMapProps> = ({ reports, onMapDoubleClick }) => {
  useEffect(() => {
    MapConfig.initialize();
  }, []);

  const mapCenter: L.LatLngExpression = [-16.42, -71.517];

  return (
    <MapContainer
      center={mapCenter}
      zoom={15}
      // Este estilo es correcto.
      style={{ height: "100%", width: "100%", borderRadius: "8px" }}
    >
      <TileLayer
        attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />
      {reports.map((report) => (
        <Marker key={report.id} position={report.position}>
          <Popup>
            <h3 className="font-bold">{report.title}</h3>
            <p>{report.description}</p>
          </Popup>
        </Marker>
      ))}
      <MapEvents onDoubleClick={onMapDoubleClick} />
    </MapContainer>
  );
};

export default InteractiveMap;