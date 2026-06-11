import { Navigate, Route, Routes } from 'react-router-dom'
import { AppShell } from '../layout/AppShell'
import { ProtectedRoute } from './ProtectedRoute'
import { LoginPage } from '../../features/auth/ui/LoginPage'
import { CatalogPage } from '../../features/catalog/ui/CatalogPage'
import { DashboardPage } from '../../features/dashboard/ui/DashboardPage'
import { InventoryPage } from '../../features/inventory/ui/InventoryPage'
import { SalesPosPage } from '../../features/sales/ui/SalesPosPage'

export function AppRouter() {
  return (
    <Routes>
      <Route path="/login" element={<LoginPage />} />
      <Route element={<ProtectedRoute />}>
        <Route element={<AppShell />}>
          <Route index element={<Navigate to="/dashboard" replace />} />
          <Route path="/dashboard" element={<DashboardPage />} />
          <Route path="/catalogo" element={<CatalogPage />} />
          <Route path="/stock" element={<InventoryPage />} />
          <Route path="/ventas" element={<SalesPosPage />} />
        </Route>
      </Route>
      <Route path="*" element={<Navigate to="/dashboard" replace />} />
    </Routes>
  )
}
